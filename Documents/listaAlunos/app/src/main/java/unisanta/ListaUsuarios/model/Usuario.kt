package unisanta.ListaUsuarios.model

data class Usuario (val nome: String = "")

interface UsuarioDao {
    fun adicionarUsuario(usuario: Usuario)
    fun obterUsuarios(): List<Usuario>
}

class UsuarioDaoImpl : UsuarioDao {
    companion object {
        private val usuarios = mutableListOf<Usuario>()
    }
    override fun adicionarUsuario(usuario: Usuario) {
        Companion.usuarios.add(usuario)
    }
    override fun obterUsuarios(): List<Usuario> {
        return Companion.usuarios
    }
}
