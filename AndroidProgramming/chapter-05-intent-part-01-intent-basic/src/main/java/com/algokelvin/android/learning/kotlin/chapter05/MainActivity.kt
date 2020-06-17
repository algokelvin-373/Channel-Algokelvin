package com.algokelvin.android.learning.kotlin.chapter05

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnToPageTwo.setOnClickListener {
            val intentToPageTwo = Intent(this, PageTwoActivity::class.java)
            startActivity(intentToPageTwo)
        }

    }
}
