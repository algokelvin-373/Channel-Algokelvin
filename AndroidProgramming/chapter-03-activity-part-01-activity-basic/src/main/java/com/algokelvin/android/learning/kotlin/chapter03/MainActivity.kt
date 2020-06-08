package com.algokelvin.android.learning.kotlin.chapter03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("chapter-03", "Run onCreate")

    }

    override fun onStart() {
        super.onStart()
        Log.d("chapter-03", "Run onStart")

    }

    override fun onResume() {
        super.onResume()
        Log.d("chapter-03", "Run onResume")

    }
}
