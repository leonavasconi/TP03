package com.example.tp2

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DetalhesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detalhes)

        val tvTitulo = findViewById<TextView>(R.id.tvTitulo)
        val tvAutor = findViewById<TextView >(R.id.tvAutor)

        val titulo = intent.getStringExtra("titulo")
        val autor = intent.getStringExtra("autor")

        tvTitulo.text = "TITULO: $titulo"
        tvAutor.text = "AUTOR: $autor"
    }
}