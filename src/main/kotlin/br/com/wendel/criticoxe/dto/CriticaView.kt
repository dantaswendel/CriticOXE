package br.com.wendel.criticoxe.dto

import br.com.wendel.criticoxe.model.StatusCritica
import java.time.LocalDateTime

data class CriticaView (

    val id : Long?,
    val titulo: String,
    val texto: String,
    val dataCriacao: LocalDateTime,
    val status: StatusCritica

)
