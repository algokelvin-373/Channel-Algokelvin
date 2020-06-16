package com.algokelvin.android.learning.kotlin.chapter09

import android.Manifest
import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.database.Cursor
import android.net.Uri
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.provider.MediaStore
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    companion object {
        const val REQUEST_SELECT_PHONE_NUMBER = 1002
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
    }

    private fun getContact() {
        val intentReadContact = Intent(Intent.ACTION_PICK).apply {
            type = ContactsContract.CommonDataKinds.Phone.CONTENT_TYPE
        }
        if (intentReadContact.resolveActivity(packageManager) != null) {
            startActivityForResult(intentReadContact, REQUEST_SELECT_PHONE_NUMBER)
        }
    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        when(requestCode) {
            REQUEST_SELECT_PHONE_NUMBER -> {
                if (grantResults[0] == PackageManager.PERMISSION_GRANTED) getContact()
                else Toast.makeText(this, "Contact Phone Permission denied", Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode == Activity.RESULT_OK) {
            when(requestCode) {
                REQUEST_SELECT_PHONE_NUMBER -> {
                    val contactData: Uri = data?.data ?: return
                    val cursor: Cursor = managedQuery(contactData, null, null, null, null)
                    if (cursor.moveToFirst()) {
                        val phone: String = cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER))
                        tvNumberPhone.text = phone
                    }
                }
            }
        }
    }
}
