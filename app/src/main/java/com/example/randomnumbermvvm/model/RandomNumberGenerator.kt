package com.example.randomnumbermvvm.model

import kotlin.random.Random

object RandomNumberGenerator {
    val randomNumber get() = Random(System.nanoTime()).nextInt(1, 7)
}