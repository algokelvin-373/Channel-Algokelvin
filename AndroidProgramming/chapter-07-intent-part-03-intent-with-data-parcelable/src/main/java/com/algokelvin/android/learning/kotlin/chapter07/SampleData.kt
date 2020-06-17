package com.algokelvin.android.learning.kotlin.chapter07

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class SampleData(
    val data1: String,
    val data2: String,
    val data3: String,
    val data4: String,
    val data5: String,
    val data6: String,
    val data7: String,
    val data8: String,
    val data9: String,
    val data10: String
) : Parcelable