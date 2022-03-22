package com.example.jdadosact

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class DadosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dados)

        val textView2 = findViewById<TextView>(R.id.textView2)
        val imageDados = findViewById<ImageView>(R.id.imageDados)
        val buttonjogar = findViewById<Button>(R.id.buttonjogar)
        val buttonvoltar = findViewById<Button>(R.id.buttonvoltar)

        val ident = intent.getIntExtra("TIPO", 0)


        buttonjogar.setOnClickListener {
            jogar(ident)
        }

        buttonvoltar.setOnClickListener {
            finish()
        }

        }
        fun jogar(lados:Int){

            val resul = (1..lados).random()

            val imageResource = NumD20(resul)
            val imageNum = findViewById<ImageView>(R.id.imageDados)
            imageNum.setImageResource(imageResource)}

    private fun NumD20(valor: Int): Int {
        return when (valor) {

        1 -> R.drawable.num1
        2 -> R.drawable.num2
        3 -> R.drawable.num3
        4 -> R.drawable.num4
        5 -> R.drawable.num5
        6 -> R.drawable.num6
        7 -> R.drawable.num7
        8 -> R.drawable.num8
        9 -> R.drawable.num9
        10 -> R.drawable.num10
        11 -> R.drawable.num11
        12 -> R.drawable.num12
        13 -> R.drawable.num13
        14 -> R.drawable.num14
        15 -> R.drawable.num15
        16 -> R.drawable.num16
        17 -> R.drawable.num17
        18 -> R.drawable.num18
        19 -> R.drawable.num19
        else -> R.drawable.num20
    }
    }
}


