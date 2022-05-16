package com.itesca.moviles.chorizito.ui.productos

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ProductosViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "This is Productos Fragment"
    }
    val text: LiveData<String> = _text
}