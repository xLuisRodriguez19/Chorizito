package com.itesca.moviles.chorizito

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.itesca.moviles.chorizito.databinding.ActivityMainBinding
import com.itesca.moviles.chorizito.ui.ingredientes.ingredientes

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //binding.btn.setOnClickListener{ startActivity(Intent(this, menu_inicio::class.java)) }
    }

    fun entrarMenu (v: View){
        val btn: Button = findViewById(R.id.btn)
        btn.setOnClickListener{ startActivity(Intent(this, menu_inicio::class.java))}
        //txt.setText("7")
    }

}