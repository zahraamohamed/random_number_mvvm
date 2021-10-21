package com.example.randomnumbermvvm.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.randomnumbermvvm.databinding.FragmentHomeBinding
import com.example.randomnumbermvvm.viewModel.DiceViewModel

class DiceFragment :Fragment(){
lateinit var binding: FragmentHomeBinding
private val diceViewModel: DiceViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(layoutInflater)
        binding.lifecycleOwner = this
        binding.diceViewModel = diceViewModel
        return binding.root
    }

}