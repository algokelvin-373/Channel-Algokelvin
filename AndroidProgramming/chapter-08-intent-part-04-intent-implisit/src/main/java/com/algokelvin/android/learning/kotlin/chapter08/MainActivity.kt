package com.algokelvin.android.learning.kotlin.chapter08

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.provider.MediaStore
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    companion object {
        const val REQUEST_SELECT_PHONE_NUMBER = 1002
        const val CAMERA_REQUEST = 1888
        const val PERMISSION_CODE_TAKE_FROM_GALLERY = 1564
        const val IMAGE_PICK_CODE = 1000
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnContactPhone.setOnClickListener {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                if (checkSelfPermission(Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED)
                    requestPermissions(arrayOf(Manifest.permission.CAMERA), REQUEST_SELECT_PHONE_NUMBER)
                else
                    getContact()
            }
        }

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

    private fun getContact() {
        val intentReadContact = Intent(Intent.ACTION_PICK).apply {
            type = ContactsContract.CommonDataKinds.Phone.CONTENT_TYPE
        }
        if (intentReadContact.resolveActivity(packageManager) != null) {
            startActivityForResult(intentReadContact, REQUEST_SELECT_PHONE_NUMBER)
        }
    }

    private fun takeImageFromCamera() {
        val cameraIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
        if (cameraIntent.resolveActivity(packageManager) != null) startActivityForResult(cameraIntent, CAMERA_REQUEST)
    }

    private fun takeImageFromGallery() {
        val intent = Intent(Intent.ACTION_PICK) // take image from gallery
        intent.type = "image/*"
        startActivityForResult(intent, IMAGE_PICK_CODE)
    }
}
