package com.example.kt14.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel(){

    private var mCounter = 0
    var commands = MutableLiveData<ArrayList<String>>()
    var counter = MutableLiveData<Int>()
    var plus : String = "+"
    var minus : String = "-"


    fun onIncrementClick() {
        counter.value = ++mCounter
    }

    fun onDecrementClick() {
        counter.value = --mCounter
    }

    fun setCommands(s: ArrayList<String>) {
        commands.value = s
    }
}