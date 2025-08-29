package com.example.segundaparte

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.random.Random

class DetalhesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detalhes)

        val tvNome = findViewById<TextView>(R.id.tvNome)
        val tvMatricula = findViewById<TextView>(R.id.tvMatricula)

        val nome = intent.getStringExtra("nome")

        val matricula = Random.nextInt(100000, 999999)

        tvNome.text = "Aluno: $nome"
        tvMatricula.text = "Matricula: $matricula"
    }

}