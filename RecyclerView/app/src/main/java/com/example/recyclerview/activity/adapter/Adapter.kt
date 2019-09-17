package com.example.recyclerview.activity.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.R
import com.example.recyclerview.activity.model.Filme
import org.w3c.dom.Text

class Adapter(var fList: List<Filme> ) : RecyclerView.Adapter<Adapter.ItemViewHolder>() {

    inner class ItemViewHolder(a_view: View) : RecyclerView.ViewHolder(a_view) {
        var movieTitle  : TextView = a_view.findViewById(R.id.tvTitle)
        var movieYear   : TextView = a_view.findViewById(R.id.tvYear)
        var movieGender : TextView = a_view.findViewById(R.id.tvGender)
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val item = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)

        return ItemViewHolder(item)
    }

    override fun getItemCount(): Int {
        return fList.size
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = fList[position]

        holder.movieTitle.text = item.title
        holder.movieGender.text = item.gender
        holder.movieYear.text = item.year
    }



}