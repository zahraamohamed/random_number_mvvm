package com.example.randomnumbermvvm.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.randomnumbermvvm.R
import com.example.randomnumbermvvm.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}