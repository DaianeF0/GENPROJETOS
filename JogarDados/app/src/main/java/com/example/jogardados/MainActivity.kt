package com.example.jogardados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    /*
        Refaçam o aplicativo de dados adicionando mais dois botões na lógica,
        sendo um botão para D12 e um botão para o D20
     */
    val buttond6 = findViewById<Button>(R.id.buttond6)
        buttond6.setOnClickListener {
        jogarDados(6)
        }

        val buttond12 = findViewById<Button>(R.id.buttond12)
        buttond12.setOnClickListener {
            jogarDados(12)
        }
        val buttond20 = findViewById<Button>(R.id.buttond20)
        buttond20.setOnClickListener {
            jogarDados(20)
        }
    }

    fun jogarDados(lados:Int){

        val resul = (1..lados).random()
        //Deixe somente a imagem para visualizar os números
        /*val text1 = findViewById<TextView>(R.id.text1)
        text1.text = resul.toString()
         */
        val imageResource = NumD20(resul)
        val imageNum = findViewById<ImageView>(R.id.imageNum)
        imageNum.setImageResource(imageResource)

    }
    private fun NumD20(valor: Int): Int {
        return when(valor){
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
