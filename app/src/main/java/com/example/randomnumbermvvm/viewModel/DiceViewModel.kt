package com.example.randomnumbermvvm.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.randomnumbermvvm.util.RandomNumberGenerator


class DiceViewModel : ViewModel() {
    var randomNumber = MutableLiveData<Int>()

    fun getRandNumber() {
        randomNumber.postValue(RandomNumberGenerator.randomNumber)
    }
}