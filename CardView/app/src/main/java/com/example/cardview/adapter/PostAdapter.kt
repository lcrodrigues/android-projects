package com.example.cardview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.cardview.R
import com.example.cardview.model.Post

class PostAdapter(a_list: List<Post>, a_context: Context) : RecyclerView.Adapter<PostAdapter.PostViewHolder>() {

    val list = a_list
    val context = a_context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_post, parent, false)
        return PostViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        val item = list[position]

        holder.username.text = item.nome
        holder.postText.text = item.postagem
        holder.postImage.setImageDrawable(ContextCompat.getDrawable(context, item.imagem))
    }

    inner class PostViewHolder(a_view: View) : RecyclerView.ViewHolder(a_view) {
        var username: TextView = a_view.findViewById(R.id.tvUsername)
        var postText: TextView = a_view.findViewById(R.id.tvPost)
        var postImage: ImageView = a_view.findViewById(R.id.ivPost)

    }
}