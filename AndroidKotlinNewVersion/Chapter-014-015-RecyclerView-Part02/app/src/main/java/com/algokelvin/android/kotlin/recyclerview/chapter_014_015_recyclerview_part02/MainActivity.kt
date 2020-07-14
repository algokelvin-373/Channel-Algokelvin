package com.algokelvin.android.kotlin.recyclerview.chapter_014_015_recyclerview_part02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvItemAvenger.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = AdapterAvenger(dataDummy(), this@MainActivity)
        }
    }
}