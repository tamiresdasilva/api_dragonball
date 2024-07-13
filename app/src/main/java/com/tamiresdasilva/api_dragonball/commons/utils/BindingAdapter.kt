package com.tamiresdasilva.api_dragonball.commons.utils

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

object BindingAdapter {
    @BindingAdapter("loadImage")
    @JvmStatic
    fun ImageView.loadImage(url: String) {
        Glide
            .with(context)
            .load(url)
            .into(this)
    }
}