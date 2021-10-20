package com.example.randomnumbermvvm.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import com.example.randomnumbermvvm.R
import com.example.randomnumbermvvm.databinding.FragmentHomeBinding
import com.example.randomnumbermvvm.ui.base.BaseFragment
import com.example.randomnumbermvvm.viewModel.DiceViewModel

class DiceFragment :BaseFragment<FragmentHomeBinding> (){

    override val layoutId= R.layout.fragment_home
    private val viewModel: DiceViewModel by viewModels()

    override val bindingInflater: (LayoutInflater, Int, ViewGroup?, Boolean)
    -> FragmentHomeBinding=DataBindingUtil::inflate

    override fun setup() {
        binding?.apply {
            this.lifecycleOwner=viewLifecycleOwner
            this.diceViewModel=this@DiceFragment.viewModel
        }
    }






}