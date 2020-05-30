package com.algokelvin.android.learning.kotlin.chapter02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    private val tag = "Chapter-02"

    //TODO: Step 1 --> onCreate Activity
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(tag, "This is onCreate Activity")
    }

    //TODO: Step 2 --> onStart Activity
    override fun onStart() {
        super.onStart()
        Log.d(tag, "This is onStart Activity")
    }

    //TODO: Step 3 --> onResume Activity
    override fun onResume() {
        super.onResume()
        Log.d(tag, "This is onResume Activity")
    }

    //TODO: Step 4 --> onPause Activity
    override fun onPause() {
        super.onPause()
        Log.d(tag, "This is onPause Activity")
    }

    //TODO: Step 5 --> onStop Activity
    override fun onStop() {
        super.onStop()
        Log.d(tag, "This is onStop Activity")
    }

    //TODO: Step 6 --> onDestroy Activity
    override fun onDestroy() {
        super.onDestroy()
        Log.d(tag, "This is onDestroy Activity")
    }
}
