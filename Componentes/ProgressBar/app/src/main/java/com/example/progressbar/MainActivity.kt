package com.example.progressbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ProgressBar

class MainActivity : AppCompatActivity() {

    lateinit var button : Button
    lateinit var horizontalPB : ProgressBar
    lateinit var progressBar  : ProgressBar
             var pbProgress   : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.button)
        horizontalPB = findViewById(R.id.horizontalPBLoading)
        progressBar = findViewById(R.id.pbLoading)

        horizontalPB.max = 100
        progressBar.visibility = View.GONE

        button.setOnClickListener {
            progressBar.visibility = View.VISIBLE

            horizontalPB.progress = pbProgress

           Thread(Runnable {
               for(i in 0 until 101) {
                   val prog = i

                   runOnUiThread {
                       horizontalPB.progress = prog
                       if(prog == 100) progressBar.visibility = View.GONE
                   }

                   Thread.sleep(100)
               }
           }).start()
        }
    }
}
