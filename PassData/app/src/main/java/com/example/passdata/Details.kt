package com.example.passdata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Details : AppCompatActivity() {

    lateinit var nome : TextView
    lateinit var idade: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        nome = findViewById(R.id.tvName)
        idade = findViewById(R.id.tvAge)

        val bundle : Bundle = intent.extras!!
        val user = bundle.getSerializable("usuario") as User

        nome.text = user.name
        idade.text = user.email

        //nome.text = bundle.getString("nome")
        //idade.text = bundle.getInt("idade").toString()



    }
}
