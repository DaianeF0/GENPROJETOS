package com.example.jdadosact

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonD6 = findViewById<Button>(R.id.buttonD6)
        val buttonD12 = findViewById<Button>(R.id.button12)
        val buttonD20 = findViewById<Button>(R.id.button20)

        val intentDados = Intent(this, DadosActivity::class.java)

        buttonD6.setOnClickListener {
            intentDados.putExtra("TIPO", 6)
            startActivity(intentDados)
        }

        buttonD12.setOnClickListener {
            intentDados.putExtra("TIPO", 12)
            startActivity(intentDados)

        }

        buttonD20.setOnClickListener {
            intentDados.putExtra("TIPO", 20)
            startActivity(intentDados)
        }

    }
}