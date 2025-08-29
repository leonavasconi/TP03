package com.example.segundaparte

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

        val etNome = findViewById<TextInputEditText>(R.id.etNome)

        val btnAvancar = findViewById<Button>(R.id.btnAdelante)

        btnAvancar.setOnClickListener {
            val nome = etNome.text.toString()


            val i = Intent(this, DetalhesActivity::class.java)
            i.putExtra("nome", nome)

            startActivity(i)
        }
    }
}