package com.example.passdata

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var send : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        send = findViewById(R.id.sendButton)

        send.setOnClickListener {
            val intent = Intent(this, Details::class.java)

            //intent.putExtra("nome", "Leo")
            //intent.putExtra("idade", 24)

            val user = User("Leonardo", "leonardocr95@gmail.com")
            intent.putExtra("usuario", user)

            startActivity(intent)
        }
    }
}
