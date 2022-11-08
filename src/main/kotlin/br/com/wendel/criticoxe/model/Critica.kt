package br.com.wendel.criticoxe.model

import java.time.LocalDateTime

data class Critica {
    val id: Long? = null,
    val titulo: String,
    val texto: String,
    val dataCriacao: LocalDateTime = LocalDateTime.now(),
    val livro:Livro,
    val usuario: Usuario,
    val status: StatusCritica = StatusCritica.NAO_RESPONDIDA
    val respostas: List<Resposta>ArrayList()

}