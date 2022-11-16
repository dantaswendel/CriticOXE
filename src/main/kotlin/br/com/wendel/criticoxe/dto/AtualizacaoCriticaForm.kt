package br.com.wendel.criticoxe.dto

import javax.validation.constraints.NotEmpty
import javax.validation.constraints.NotNull

data class AtualizacaoCriticaForm (

    @field:NotNull
    val id: Long,
    @field:NotEmpty
    val titulo: String,
    @field:NotEmpty
    val texto: String
        )


