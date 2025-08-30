package unisanta.ListaUsuarios

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import unisanta.ListaUsuarios.model.UsuarioDaoImpl

class ListaUsuarioActivity : AppCompatActivity() {
    private val usuarioDao = UsuarioDaoImpl()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_usuario)
        val recyclerViewUsuarios = findViewById<RecyclerView>(R.id.recyclerView_usuarios)
        val usuarios = usuarioDao.obterUsuarios()
        37
        recyclerViewUsuarios.layoutManager = LinearLayoutManager(this)
        recyclerViewUsuarios.adapter = UsuarioAdapter(usuarios)
    }
}
