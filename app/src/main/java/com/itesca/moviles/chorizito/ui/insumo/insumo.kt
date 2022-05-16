package com.itesca.moviles.chorizito.ui.insumo

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.itesca.moviles.chorizito.R

class insumo : Fragment() {

    companion object {
        fun newInstance() = insumo()
    }

    private lateinit var viewModel: InsumoViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.insumo_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(InsumoViewModel::class.java)
        // TODO: Use the ViewModel
    }

}