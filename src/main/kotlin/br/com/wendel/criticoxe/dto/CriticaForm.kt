package br.com.wendel.criticoxe.dto

data class CriticaForm (

    val id : Long?,
    val titulo: String,
    val texto: String,
    val idLivro: Long,
    val idUsuario: Long

        )
