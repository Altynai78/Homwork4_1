package com.example.homwork4_1.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class SekondViewModel {

    private val _text = MutableLiveData<String>().apply {
        value = "This is First Fragment"
    }
    val text: LiveData<String> = _text
}
