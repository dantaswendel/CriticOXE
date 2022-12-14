package br.com.wendel.criticoxe.model

import java.time.LocalDateTime
import javax.persistence.*

@Entity
data class Resposta (
    @Id @GeneratedValue(strategy= GenerationType.IDENTITY)
    val id: Long?,
    val mensagem: String,
    val dataCriacao: LocalDateTime= LocalDateTime.now(),
    @ManyToOne
    val autor: Usuario,
    @ManyToOne
    val critica: Critica,
    val RespostaEscritor: Boolean
        )



