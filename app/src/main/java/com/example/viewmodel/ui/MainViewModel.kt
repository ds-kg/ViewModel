package com.example.viewmodel.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private var count = 0
    val counter = MutableLiveData<Int>()
    val text = MutableLiveData<String>()

    fun increment() {
        counter.value = ++count
        text.value += "+ \n"
    }

    fun discrement() {
        counter.value = --count
        text.value += "- \n"
    }

}