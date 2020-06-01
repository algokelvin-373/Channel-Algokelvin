package com.algokelvin.android.learning.kotlin.chapter04

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //TODO: Check value 'DATA_NAME' from bundle onSaveInstance
        if (savedInstanceState != null) {
            tvYourName.text = savedInstanceState.getString("DATA_NAME").toString()
        }

        btnOK.setOnClickListener {
            tvYourName.text = "Your name is ${edtYourName.text}"
        }
    }

    //TODO: Implement onSaveInstance
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString("DATA_NAME", tvYourName.text.toString())
    }
}
