package br.com.wendel.criticoxe.controller

import br.com.wendel.criticoxe.dto.CriticaDto
import br.com.wendel.criticoxe.model.*
import br.com.wendel.criticoxe.service.CriticaService
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/criticas")
class TopicoController (private val service: CriticaService) {

    @GetMapping
    fun listar(): List<Critica> {
        return service.listar()
    }

    @GetMapping("/{id}")
    fun buscarPorId(@PathVariable id: Long): Critica {
        return service.buscarporId(id)
    }

        @PostMapping
        fun cadastrar(@RequestBody dto: CriticaDto){
            service.cadastrar(criticacto)
        }
}