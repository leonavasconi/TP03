package unisanta.ListaUsuarios

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import unisanta.ListaUsuarios.model.Usuario
import unisanta.ListaUsuarios.model.UsuarioDaoImpl

class MainActivity : AppCompatActivity() {
    private val usuarioDao = UsuarioDaoImpl()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val editTextNome = findViewById<EditText>(R.id.editText_nome)
        val buttonAdicionar = findViewById<Button>(R.id.button_adicionar)
        val buttonListarUsuarios = findViewById<Button>(R.id.button_listar_usuarios)
        buttonAdicionar.setOnClickListener {
            val nome = editTextNome.text.toString()
            val usuario = Usuario(nome)
            usuarioDao.adicionarUsuario(usuario)
            editTextNome.text.clear()
        }
        buttonListarUsuarios.setOnClickListener {
            val intent = Intent(this, ListaUsuarioActivity::class.java)
            startActivity(intent)
        }
    }
}