package com.algokelvin.android.kotlin.recyclerview.part01

data class DataClass(val name: String)

fun dataDummy(): ArrayList<DataClass> {
    val data = ArrayList<DataClass>()
    data.add(DataClass("Kotlin"))
    data.add(DataClass("Java"))
    data.add(DataClass("Python"))
    data.add(DataClass("Dart"))
    data.add(DataClass("Swift"))
    return data
}