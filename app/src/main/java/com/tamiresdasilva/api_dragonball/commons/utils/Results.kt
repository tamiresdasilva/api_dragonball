package com.tamiresdasilva.api_dragonball.commons.utils

sealed class Results<out T> {
    data object Loading : Results<Nothing>()
    data class Success<out T>(val data: T) : Results<T>()
    data class Error(val exception: Exception) : Results<Nothing>()
}