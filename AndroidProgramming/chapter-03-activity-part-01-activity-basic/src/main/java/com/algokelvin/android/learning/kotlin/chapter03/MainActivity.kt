package com.algokelvin.android.learning.kotlin.chapter03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnOK.setOnClickListener {
            tvYourName.text = "Your name is ${edtYourName.text}"
        }
    }
}
