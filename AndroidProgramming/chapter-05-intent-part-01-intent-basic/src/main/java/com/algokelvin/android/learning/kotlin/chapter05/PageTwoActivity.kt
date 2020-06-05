package com.algokelvin.android.learning.kotlin.chapter05

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_page_two.*

class PageTwoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page_two)

        btnToMainPage.setOnClickListener {
            val intentToMainPage = Intent(this, MainActivity::class.java)
            startActivity(intentToMainPage)
        }
    }
}