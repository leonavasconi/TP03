package com.example.tp2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText




class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val etTitulo = findViewById<TextInputEditText>(R.id.etTitulo)
        val etAutor = findViewById<TextInputEditText>(R.id.etAutor)
        val btnCadastrar = findViewById<Button>(R.id.btnCadastrar)

        btnCadastrar.setOnClickListener {
            val titulo = etTitulo.text.toString()
            val autor = etAutor.text.toString()

            val i = Intent(this, DetalhesActivity::class.java)
            i.putExtra("titulo", titulo)
            i.putExtra("autor", autor)
            startActivity(i)
        }
    }
}