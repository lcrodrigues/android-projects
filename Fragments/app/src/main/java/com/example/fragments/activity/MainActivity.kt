package com.example.fragments.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.fragments.R
import com.example.fragments.fragment.ContatosFragment
import com.example.fragments.fragment.ConversasFragment

class MainActivity : AppCompatActivity() {

    lateinit var btConversas : Button
    lateinit var btContatos : Button
    lateinit var conversasFragment: ConversasFragment
    lateinit var contatosFragment: ContatosFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.elevation = 0f

        btConversas = findViewById(R.id.btnConversa)
        btContatos = findViewById(R.id.btnContato)

        conversasFragment = ConversasFragment()
        contatosFragment = ContatosFragment()

        val transaction = supportFragmentManager.beginTransaction()     //inicia uma transação
        transaction.replace(R.id.frameConteudo, conversasFragment)
        transaction.commit()                                            //encerra uma transação

        btContatos.setOnClickListener {
            val ctTransaction = supportFragmentManager.beginTransaction()
            ctTransaction.replace(R.id.frameConteudo, contatosFragment)
            ctTransaction.commit()
        }

        btConversas.setOnClickListener {
            val coTransaction = supportFragmentManager.beginTransaction()
            coTransaction.replace(R.id.frameConteudo, conversasFragment)
            coTransaction.commit()
        }
    }
}
