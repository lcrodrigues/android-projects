package com.example.cardview.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.cardview.R
import com.example.cardview.adapter.PostAdapter
import com.example.cardview.model.Post

class MainActivity : AppCompatActivity() {

    lateinit var mRecyclerPost : RecyclerView
    private var mPosts = ArrayList<Post>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mRecyclerPost = findViewById(R.id.recyclerPost)

        val layoutManager = LinearLayoutManager(this)
        //val layoutManager = GridLayoutManager(this, 2)

        mRecyclerPost.layoutManager = layoutManager
        mRecyclerPost.adapter = PostAdapter(mPosts, this)
        setPosts()
    }

    private fun setPosts() {
        mPosts.add(Post("Leonardo", "Legal legal.", R.drawable.imagem1))
        mPosts.add(Post("Leonardo", "Show de bola.", R.drawable.imagem2))
        mPosts.add(Post("Leonardo", "Bonito.", R.drawable.imagem3))
        mPosts.add(Post("Leonardo", "Sim.", R.drawable.imagem4))
    }
}
