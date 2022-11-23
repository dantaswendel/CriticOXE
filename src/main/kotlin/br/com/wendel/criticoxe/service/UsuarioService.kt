package br.com.wendel.criticoxe.service


import br.com.wendel.criticoxe.model.Usuario
import br.com.wendel.criticoxe.repository.UsuarioRepository
import org.springframework.stereotype.Service

@Service
class UsuarioService (private val repository : UsuarioRepository) {


    fun buscarPorId (id : Long) : Usuario {
        return  repository.getOne(id)
    }

}
