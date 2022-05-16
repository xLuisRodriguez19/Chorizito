package com.itesca.moviles.chorizito.ui.ingredientes

import android.content.Intent
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.itesca.moviles.chorizito.R
import com.itesca.moviles.chorizito.menu_inicio

class ingredientes : Fragment() {

    companion object {
        fun newInstance() = ingredientes()
    }

    private lateinit var viewModel: IngredientesViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val vista: View = inflater.inflate(R.layout.ingredientes_fragment, container, false);
        return inflater.inflate(R.layout.ingredientes_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(IngredientesViewModel::class.java)
        // TODO: Use the ViewModel
    }

}