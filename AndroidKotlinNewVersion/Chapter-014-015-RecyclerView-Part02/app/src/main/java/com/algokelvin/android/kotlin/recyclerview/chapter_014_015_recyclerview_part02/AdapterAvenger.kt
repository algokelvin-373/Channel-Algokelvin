package com.algokelvin.android.kotlin.recyclerview.chapter_014_015_recyclerview_part02

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.item_data_avenger.view.*

class AdapterAvenger(private val listAvenger: ArrayList<DataAvenger>, private val context: Context): RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return AvengerViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_data_avenger,parent, false))
    }

    override fun getItemCount(): Int = listAvenger.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        holder.itemView.tvAvengerName.text = listAvenger[position].name
        Glide.with(context).load(listAvenger[position].image).into(holder.itemView.imgAvenger)

        //SetOnClickListener
        holder.itemView.setOnClickListener {
            Toast.makeText(context, "You choose ${listAvenger[position].name}", Toast.LENGTH_LONG).show()

            //Go to Detail
            val goToDetail = Intent(context, AvengerDetail::class.java)
            val dataParcelableAvenger = DataAvenger(
                listAvenger[position].name, listAvenger[position].image, listAvenger[position].description
            )
            goToDetail.putExtra("data_avenger", dataParcelableAvenger)
            context.startActivity(goToDetail)
        }
    }

    class AvengerViewHolder(view: View): RecyclerView.ViewHolder(view)
}