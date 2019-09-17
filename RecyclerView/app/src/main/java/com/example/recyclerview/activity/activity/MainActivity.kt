package com.example.recyclerview.activity.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.LinearLayout
import android.widget.Toast
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.R
import com.example.recyclerview.activity.RecyclerItemTouchListener
import com.example.recyclerview.activity.adapter.Adapter
import com.example.recyclerview.activity.model.Filme

class MainActivity : AppCompatActivity() {

    lateinit var rView : RecyclerView
             var filmes : List<Filme> = arrayListOf(
                 Filme("Pulp Fiction", "Suspense", "1994"),
                 Filme("Kill Bill", "Ação", "2003"),
                 Filme("Kill Bill 2", "Ação", "2004"),
                 Filme("Troia", "Drama", "2004"),
                 Filme("Cisne Negro", "Drama", "2012"),
                 Filme("John Wick", "Ação", "2014"),
                 Filme("Atividade Paranormal", "Terror", "2010")
             )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rView = findViewById(R.id.recyclerView)

        val layoutManager = LinearLayoutManager(applicationContext)
        val adapter = Adapter(filmes)

        rView.layoutManager = layoutManager
        rView.setHasFixedSize(true)
        rView.adapter = adapter
        rView.addItemDecoration(DividerItemDecoration(this, LinearLayout.VERTICAL))

        rView.addOnItemTouchListener(
            RecyclerItemTouchListener(
                this,
                rView,
                object : RecyclerItemTouchListener.OnItemClickListener {
                    override fun onItemClick(view: View, position: Int) {
                        Toast.makeText(applicationContext, "Click 1", Toast.LENGTH_SHORT).show()
                    }

                    override fun onItemClick(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                        Toast.makeText(applicationContext, "Click 2", Toast.LENGTH_SHORT).show()
                    }

                    override fun onLongItemClick(view: View, position: Int) {
                        Toast.makeText(applicationContext, "Long Click", Toast.LENGTH_SHORT).show()
                    }

        }))
    }
}
