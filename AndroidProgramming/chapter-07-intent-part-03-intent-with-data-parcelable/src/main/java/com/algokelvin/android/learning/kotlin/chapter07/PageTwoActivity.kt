package com.algokelvin.android.learning.kotlin.chapter07

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

        val getSampleData = intent.getParcelableExtra<SampleData>("data_parcelable") ?: null

        tvData01.text = getSampleData?.data1
        tvData02.text = getSampleData?.data2
        tvData03.text = getSampleData?.data3
        tvData04.text = getSampleData?.data4
        tvData05.text = getSampleData?.data5
        tvData06.text = getSampleData?.data6
        tvData07.text = getSampleData?.data7
        tvData08.text = getSampleData?.data8
        tvData09.text = getSampleData?.data9
        tvData10.text = getSampleData?.data10
    }
}