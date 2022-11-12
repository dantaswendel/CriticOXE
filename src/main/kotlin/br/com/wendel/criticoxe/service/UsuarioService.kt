package br.com.wendel.criticoxe.service

import br.com.wendel.criticoxe.model.Livro
import br.com.wendel.criticoxe.model.Usuario
import org.springframework.stereotype.Service
import java.util.*

@Service
class UsuarioService (var usuarios : List<Usuario>) {

    init {
        val usuario= Usuario (
            id =1,
            nome = "Capitães de Areia",
            email= "umemaillegal@coisa.com"

        )
        usuarios = Arrays.asList(usuario)

    }

    fun buscarPorId (id : Long) : Usuario {
        return  usuarios.stream().filter({
                u -> u.id == id
        }).findFirst().get()
    }

}
