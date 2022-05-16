package com.itesca.moviles.chorizito.ui.registrar

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.itesca.moviles.chorizito.databinding.FragmentRegistrarBinding
import com.itesca.moviles.chorizito.ui.home.HomeViewModel

class RegistrarFragment : Fragment() {

    private var _binding: FragmentRegistrarBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val registrarViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentRegistrarBinding.inflate(inflater, container, false)
        val root: View = binding.root

        /*val textView: TextView = binding.texto
        registrarViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }*/
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}