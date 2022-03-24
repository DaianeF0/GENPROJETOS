package com.example.appcliques

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.appcliques.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private lateinit var mainViewModel: MainViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        mainViewModel.resClique.observe(this){ binding.quantClique.text=
            mainViewModel.cont().toString()

        binding.buttonClique.setOnClickListener {

            mainViewModel.resClique.value = binding.quantClique.text.toString().toInt()

        }

        }





    }
}