package com.algokelvin.android.kotlin.recyclerview.part01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val data = dataDummy()

        rvItemData.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = AdapterData(data)
        }

        buttonAddData.setOnClickListener {
            val index = edtIndexDataItem.text.toString().toInt()
            val item = ArrayList<DataClass>()
            item.add(DataClass("PHP"))
            item.add(DataClass("Go"))
            item.add(DataClass("Javascript"))

            data.addAll(index, item)
            rvItemData.adapter?.notifyItemRangeInserted(index, item.size)
        }

        buttonDeleteData.setOnClickListener {
            val index = 2
            data.removeAt(index)
            rvItemData.adapter?.notifyItemRemoved(index)
        }
        buttonDeleteDataMultiple.setOnClickListener {
            val startIndex = 2
            val endIndex = 5
            val rangeIndex = endIndex - startIndex
            data.subList(startIndex, endIndex).clear()
            rvItemData.adapter?.notifyItemRangeRemoved(startIndex, rangeIndex)
        }
        buttonDeleteAllData.setOnClickListener {
            data.clear()
            rvItemData.adapter?.notifyDataSetChanged()
        }
    }
}