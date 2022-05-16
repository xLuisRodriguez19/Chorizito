package com.itesca.moviles.chorizito.ui.registrar

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class RegistrarViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Registrar Fragment"
    }
    val text: LiveData<String> = _text
}