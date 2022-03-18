package com.example.jogardadosnav

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Dados12Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dados12)

        val buttond12 = findViewById<Button>(R.id.buttond12)
        buttond12.setOnClickListener {
            jogarDados(12)
        }

        val volta1 = findViewById<Button>(R.id.VOLTA1)

        val intentDados20 = Intent(this, Dados20Activity::class.java)

        buttond12.setOnClickListener {
            startActivity(intentDados20) }
        volta1.setOnClickListener {
            finish() }


    }

    fun jogarDados(lados:Int){

        val resul = (1..lados).random()

        val text1 = findViewById<TextView>(R.id.textView2)
        text1.text = resul.toString()

    }
}