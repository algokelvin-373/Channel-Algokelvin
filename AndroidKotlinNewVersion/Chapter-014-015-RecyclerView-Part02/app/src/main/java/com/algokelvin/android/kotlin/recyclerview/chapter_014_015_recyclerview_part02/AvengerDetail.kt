package com.algokelvin.android.kotlin.recyclerview.chapter_014_015_recyclerview_part02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_avenger_detail.*

class AvengerDetail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_avenger_detail)

        //Get data parcelable
        val data = intent.getParcelableExtra<DataAvenger>("data_avenger")

        tvNameAvengerDetail.text = data?.name
        Glide.with(this).load(data?.image).into(imgAvengerDetail)
        tvDescriptionAvenger.text = data?.description
    }
}