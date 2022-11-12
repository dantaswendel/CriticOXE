package br.com.wendel.criticoxe.model

import java.time.LocalDateTime

data class Resposta (
    val id: Long?,
    val mensagem: String,
    val dataCriacao: LocalDateTime= LocalDateTime.now(),
    val autor: Usuario,
    val critica: Critica,
    val RespostaEscritor: Boolean
        )



