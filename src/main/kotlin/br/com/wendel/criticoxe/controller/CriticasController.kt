package br.com.wendel.criticoxe.controller

import br.com.wendel.criticoxe.model.*
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDateTime
import java.util.Arrays

@RestController
@RequestMapping("/criticas")
class TopicoController {

    @GetMapping
    fun listar(): List<Critica> {
        val critica = Critica(
            id = 1,
            titulo = "Pedro Bala e o amor pela causa",
            texto = "Capitães de Areia não sentem medo de nada",
            livro = Livro (
                id = 1,
                nome = "Capitaes de Areia",
                autor = "Machado de Assis",
                Genero = "Romance"
            ),

            usuario= Usuario (
                id = 1,
            nome = "Maria das Graças",
            email = "mariadasgracas@gmail.com"
        ),

        )

        return Arrays.asList(critica, critica, critica)
    }
}