package com.example.randomnumbermvvm.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.randomnumbermvvm.model.RandomNumberRepository


class DiceViewModel : ViewModel() {
    private val randomNumberRepository = RandomNumberRepository()
    var randomNumber = MutableLiveData<Int>()

    fun getNumber() {
        randomNumber.postValue(randomNumberRepository.randomNumber())
    }
}