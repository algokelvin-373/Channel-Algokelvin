package com.algokelvin.android.learning.kotlin.chapter10

import android.Manifest
import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.Bitmap
import android.os.Build
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    companion object {
        const val CAMERA_REQUEST = 1888
        const val PERMISSION_CODE_TAKE_FROM_GALLERY = 1564
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCamera.setOnClickListener {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                if (checkSelfPermission(Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED)
                    requestPermissions(arrayOf(Manifest.permission.CAMERA), CAMERA_REQUEST)
                else
                    takeImageFromCamera()
            }
        }

        btnGallery.setOnClickListener {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
                if (checkSelfPermission(Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_DENIED) {
                    val permissions = arrayOf(Manifest.permission.READ_EXTERNAL_STORAGE)
                    requestPermissions(permissions, PERMISSION_CODE_TAKE_FROM_GALLERY)
                }
                else takeImageFromGallery()
            }
        }
    }

    private fun takeImageFromCamera() {
        val cameraIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
        if (cameraIntent.resolveActivity(packageManager) != null) startActivityForResult(cameraIntent, CAMERA_REQUEST)
    }

    private fun takeImageFromGallery() {
        val intent = Intent(Intent.ACTION_PICK) // take image from gallery
        intent.type = "image/*"
        startActivityForResult(intent, PERMISSION_CODE_TAKE_FROM_GALLERY)
    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        when(requestCode) {
            CAMERA_REQUEST -> {
                if (grantResults[0] == PackageManager.PERMISSION_GRANTED) takeImageFromCamera()
                else Toast.makeText(this, "Camera Permission denied", Toast.LENGTH_SHORT).show()
            }
            PERMISSION_CODE_TAKE_FROM_GALLERY -> {
                if (grantResults[0] == PackageManager.PERMISSION_GRANTED) takeImageFromGallery()
                else Toast.makeText(this, "Gallery Permission denied", Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode == Activity.RESULT_OK) {
            when(requestCode) {
                CAMERA_REQUEST -> {
                    val photos = data?.extras?.get("data") as Bitmap
                    imageData.setImageBitmap(photos)
                }
                PERMISSION_CODE_TAKE_FROM_GALLERY -> {
                    val dataImage = data?.data
                    imageData.setImageURI(dataImage)
                }
            }
        }
    }
}
