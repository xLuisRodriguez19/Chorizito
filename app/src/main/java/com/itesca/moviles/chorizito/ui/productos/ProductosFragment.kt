package com.itesca.moviles.chorizito.ui.productos

import android.content.Intent
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewStructure
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.Nullable
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import androidx.navigation.Navigation
import com.itesca.moviles.chorizito.R
import com.itesca.moviles.chorizito.databinding.FragmentProductosBinding
import com.itesca.moviles.chorizito.menu_inicio
import com.itesca.moviles.chorizito.ui.ingredientes.ingredientes
import com.itesca.moviles.chorizito.ui.productos.ProductosViewModel

class ProductosFragment : Fragment(){
    private var _binding: FragmentProductosBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this).get(ProductosViewModel::class.java)

        _binding = FragmentProductosBinding.inflate(inflater, container, false)
        val root: View = binding.root
        binding.button.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_nav_prod_to_ingredientes2)
        )
        /*val textView: TextView = binding.texto
        homeViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }*/

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
/*
    fun OnClick (it: View){
        binding.apply {
            val btn: Button = it.findViewById(R.id.button)
            btn.text="Hola"
        }
        //txt.setText("7")
    }

    val vista: View = inflater.inflate(R.layout.fragment_productos, container, false)
    val btn: Button = vista.findViewById<Button>(R.id.button4)
    btn.setOnClickListener(View.OnClickListener() {
        @Nullable
        @Override
        fun View.OnClick(){
            val fragMan:FragmentManager = FragmentActivity().getSupportFragmentManager()
            val fragTran: FragmentTransaction = fragMan.beginTransaction()
            fragTran.setReorderingAllowed(true);
            fragTran.replace(R.id.prod, ingredientes.newInstance())
            fragTran.commit()
        }
    });*/
}