package com.example.basicalert

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dialog = AlertDialog.Builder(this)

        dialog.setTitle("Alerta!")
        dialog.setMessage("Pressione um botão.")

        //dialog.setCancelable(false) //não permite que o usuário clique fora

        dialog.setPositiveButton("Sim") { dialogInterface, i ->
            Toast.makeText(applicationContext, "O botão 'sim' foi pressionado.", Toast.LENGTH_SHORT).show()
        }
        dialog.setNegativeButton("Não") { dialogInterface, i ->
            Toast.makeText(applicationContext, "O botão 'não' foi pressionado.", Toast.LENGTH_SHORT).show()
        }

        dialog.setIcon(android.R.drawable.ic_menu_camera)

        dialog.create()
        dialog.show()

    }
}
