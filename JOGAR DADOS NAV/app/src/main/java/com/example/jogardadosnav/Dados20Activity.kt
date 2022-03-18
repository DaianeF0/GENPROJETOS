package com.example.jogardadosnav

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Dados20Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dados20)

        val buttond20 = findViewById<Button>(R.id.buttond20)
        buttond20.setOnClickListener {
            jogarDados(20)
        }

        val volta1 = findViewById<Button>(R.id.VOLTA1)
        volta1.setOnClickListener {
            finish() }
    }

    fun jogarDados(lados:Int){

        val resul = (1..lados).random()

        val text1 = findViewById<TextView>(R.id.buttond20)
        text1.text = resul.toString()

    }

}