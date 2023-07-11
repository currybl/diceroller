package com.chickfila.diceroller.architecture.model

import android.widget.ImageView


object DataBindingAdapters {
    @androidx.databinding.BindingAdapter("imageResource")
    fun setImageResource(imageView: ImageView, resource: Int) {
        imageView.setImageResource(resource)
    }
}