package com.example.snackbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener {
            Snackbar.make(it, "Botão pressionado!", Snackbar.LENGTH_LONG)
                .setAction("Confirmar") { button.text = "Botão alterado." }
                .show()
        }
    }
}
