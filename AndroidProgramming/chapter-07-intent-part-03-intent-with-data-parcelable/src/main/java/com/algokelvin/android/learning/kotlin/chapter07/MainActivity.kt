package com.algokelvin.android.learning.kotlin.chapter07

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sampleData = SampleData("Kotlin", "Java", "PHP", "Javascript", "C++",
            "Python", "Ruby", "Golang", "Swift", "Dart")

        btnToPageTwo.setOnClickListener {
            val intentToPageTwo = Intent(this, PageTwoActivity::class.java)
            intentToPageTwo.putExtra("data_parcelable", sampleData)
            startActivity(intentToPageTwo)
        }
    }
}
