package com.example.randomnumbermvvm.model

import kotlin.random.Random

object RandomNumber {
    private const val startNumber=1
    private const val endNumber=7
    val randomNumber get() = Random(System.nanoTime()).nextInt(startNumber, endNumber)
}