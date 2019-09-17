package com.example.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var lvListView : ListView

    val listItems = arrayListOf("Carteira", "Gabinete", "Moletom", "Cama", "Roupeiro", "Parede",
                                "Caneca", "Prato", "Janela")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lvListView = findViewById(R.id.lvList)

        val adapter = ArrayAdapter(applicationContext,
                                           android.R.layout.simple_expandable_list_item_1,
                                           android.R.id.text1,
                                           listItems)

        lvListView.adapter = adapter

        lvListView.setOnItemClickListener { adapterView, view, i, l ->
            val clicked = lvListView.getItemAtPosition(i).toString()
            Toast.makeText(this, "Item: $clicked", Toast.LENGTH_SHORT).show()
        }
    }
}
