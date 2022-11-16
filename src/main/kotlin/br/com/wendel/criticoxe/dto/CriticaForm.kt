package br.com.wendel.criticoxe.dto

import javax.validation.constraints.NotEmpty
import javax.validation.constraints.NotNull

data class CriticaForm (

    val id : Long?,
    @field:NotEmpty  val titulo: String,
    @field:NotEmpty val texto: String,
    @field:NotNull val idLivro: Long,
    @field:NotNull val idUsuario: Long

        )
