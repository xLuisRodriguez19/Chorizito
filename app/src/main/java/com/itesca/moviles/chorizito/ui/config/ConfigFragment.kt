package com.itesca.moviles.chorizito.ui.config

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.itesca.moviles.chorizito.R
import com.itesca.moviles.chorizito.databinding.ConfigFragmentBinding
import com.itesca.moviles.chorizito.ui.Cotizar.CotizarViewModel

class ConfigFragment : Fragment() {

    private var _binding: ConfigFragmentBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val configViewModel =
            ViewModelProvider(this).get(ConfigViewModel::class.java)

        _binding = ConfigFragmentBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.texto
        configViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}