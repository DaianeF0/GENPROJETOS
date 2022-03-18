package com.example.jogardadosnav

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Dados6Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dados6)

        val buttond6 = findViewById<Button>(R.id.buttond6)
        buttond6.setOnClickListener {
            jogarDados(6)
        }

        val volta1 = findViewById<Button>(R.id.VOLTA1)

        val intentDados12 = Intent(this, Dados12Activity::class.java)

        buttond6.setOnClickListener {
            startActivity(intentDados12)
        }
        volta1.setOnClickListener {
            finish()
        }


    }

    fun jogarDados(lados:Int){

        val resul = (1..lados).random()
        val text1 = findViewById<TextView>(R.id.textView1)
        text1.text = resul.toString()

    }
}