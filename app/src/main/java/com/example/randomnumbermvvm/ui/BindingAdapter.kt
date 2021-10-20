package com.example.randomnumbermvvm

import android.widget.ImageView
import androidx.databinding.BindingAdapter

@BindingAdapter(value = ["setImage"])
fun setImage(view: ImageView?, value: Int) {
    when (value) {
        1 -> view?.setImageResource(R.drawable.one)
        2 -> view?.setImageResource(R.drawable.two)
        3 -> view?.setImageResource(R.drawable.three)
        4 -> view?.setImageResource(R.drawable.four)
        5 -> view?.setImageResource(R.drawable.five)
        6 -> view?.setImageResource(R.drawable.six)
    }
}