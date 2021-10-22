package com.example.randomnumbermvvm.util

import kotlin.random.Random

object RandomNumberGenerator {
    val randomNumber: Int get() = Random(System.nanoTime()).nextInt(1, 7)
}