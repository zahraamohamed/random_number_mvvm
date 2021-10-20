package com.example.randomnumbermvvm.ui.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding

abstract class BaseFragment<VB : ViewBinding>() : Fragment() {

    abstract val layoutId: Int
    private lateinit var _binding: ViewBinding
    var binding: VB?
        get() = _binding as VB?
        set(value) = TODO()

    abstract val bindingInflater: (LayoutInflater, Int, ViewGroup?, Boolean) -> VB

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setup()
    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = bindingInflater(inflater, layoutId, container, false).apply {
        _binding = this
    }.root

    abstract fun setup()
}