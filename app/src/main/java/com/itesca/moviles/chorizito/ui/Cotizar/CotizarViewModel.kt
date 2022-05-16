package com.itesca.moviles.chorizito.ui.Cotizar

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CotizarViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Cotizar Fragment"
    }
    val text: LiveData<String> = _text
}