package com.algokelvin.android.kotlin.recyclerview.part01

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_data.view.*


class AdapterData(private val list: ArrayList<DataClass>): RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return DataViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_data, parent, false))
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        holder.itemView.textView_Data.text = list[position].name
    }

    class DataViewHolder(view: View): RecyclerView.ViewHolder(view)
}