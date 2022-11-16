package br.com.wendel.criticoxe.dto

import br.com.wendel.criticoxe.model.Livro
import br.com.wendel.criticoxe.model.Resposta
import br.com.wendel.criticoxe.model.StatusCritica
import br.com.wendel.criticoxe.model.Usuario
import java.time.LocalDateTime

data class CriticaDto (

    val id : Long?,
    val titulo: String,
    val texto: String,
    val idLivro: Long,
    val idUsuario: Long

        )
