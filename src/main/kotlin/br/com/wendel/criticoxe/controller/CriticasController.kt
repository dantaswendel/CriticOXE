package br.com.wendel.criticoxe.controller

import br.com.wendel.criticoxe.dto.AtualizacaoCriticaForm
import br.com.wendel.criticoxe.dto.CriticaForm
import br.com.wendel.criticoxe.dto.CriticaView
import br.com.wendel.criticoxe.model.*
import br.com.wendel.criticoxe.service.CriticaService
import org.springframework.web.bind.annotation.*
import javax.validation.Valid


@RestController
@RequestMapping("/criticas")
class CriticasController(private val service: CriticaService) {

    @GetMapping
    fun listar(): List<CriticaView>? {
        return service.listar()
    }

    @GetMapping("/{id}")
    fun buscarPorId(@PathVariable id: Long): CriticaView {
        return service.buscarporId(id)
    }

        @PostMapping
        fun cadastrar(@RequestBody @Valid dto : CriticaForm){
            service.cadastrar(dto)
        }
    @PutMapping
    fun atualizar (@RequestBody @Valid form : AtualizacaoCriticaForm){
        service.atualizar(form)
    }

    @DeleteMapping ("/{id}")
    fun deletar (@PathVariable id : Long){
        service.deletar(id)

    }


}