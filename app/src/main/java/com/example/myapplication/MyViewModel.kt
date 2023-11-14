package com.example.myapplication

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewModel : ViewModel() {
    val counter = MutableLiveData<Int>()
    fun setValue() {
        counter.value = (counter.value ?: 0) + 1
    }
}