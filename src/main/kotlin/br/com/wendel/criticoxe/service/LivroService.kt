package br.com.wendel.criticoxe.service

import br.com.wendel.criticoxe.model.Livro
import org.springframework.stereotype.Service
import java.util.*

@Service
class LivroService(var livros : List<Livro>) {

    init {
        val livro= Livro (
        id =1,
        nome = "Capitães de Areia",
        autor= "Jorginho Amado",
        Genero= "Romance"
                )
        val livro= Livro (
            id =2,
            nome = "Memorias Postumas",
            autor= "Machado de Assis",
            Genero= "Romance"
        )
        livros = Arrays.asList(livro)

    }

    fun buscarPorId (id : Long) : Livro {
        return  livros.stream().filter({
            l -> l.id == id
        }).findFirst().get()
    }

}
