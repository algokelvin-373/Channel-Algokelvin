package com.algokelvin.android.learning.kotlin.chapter06

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnToPageTwo.setOnClickListener {
            val intentToMainPage = Intent(this, PageTwoActivity::class.java)
            intentToMainPage.putExtra("data", edtData.text.toString())
            intentToMainPage.putExtra("dataInteger", edtDataInteger.text.toString().toInt())
            startActivity(intentToMainPage)
        }

    }
}
