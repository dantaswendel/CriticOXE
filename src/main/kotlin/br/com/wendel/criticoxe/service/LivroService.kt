package br.com.wendel.criticoxe.service

import br.com.wendel.criticoxe.model.Livro
import br.com.wendel.criticoxe.repository.LivroRepository
import org.springframework.stereotype.Service

@Service
class LivroService(private val repository:LivroRepository) {

      fun buscarPorId (id : Long) : Livro {
        return repository.getOne(id)
    }

}
