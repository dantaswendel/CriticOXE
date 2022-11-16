package br.com.wendel.criticoxe.service

import br.com.wendel.criticoxe.dto.AtualizacaoCriticaForm
import br.com.wendel.criticoxe.dto.CriticaForm
import br.com.wendel.criticoxe.dto.CriticaView
import br.com.wendel.criticoxe.mapper.CriticaFormMapper
import br.com.wendel.criticoxe.mapper.CriticaViewMapper
import br.com.wendel.criticoxe.model.Critica
import org.springframework.stereotype.Service
import java.util.*
import java.util.stream.Collectors


@Service
class CriticaService (
    private var criticas: List<Critica> = ArrayList(),
    private val criticaviewMapper: CriticaViewMapper,
    private val criticaformMapper: CriticaFormMapper

) {

   fun listar(): List<CriticaView>? {
return criticas.stream().map {
        c -> criticaviewMapper.map(c) }.collect(Collectors.toList()) }

    fun buscarporId(id: Long): CriticaView {
        val crtc = criticas.stream().filter{ c ->
            c.id == id

        }.findFirst().get()
         return criticaviewMapper.map(crtc)

    }
    fun cadastrar(form: CriticaForm) {
        val critica = criticaformMapper.map(form)
        critica.id = criticas.size.toLong() +1
 criticas = criticas.plus(criticaformMapper.map(form))
    }

    fun atualizar( form : AtualizacaoCriticaForm){
        //recuperando Critica

        val crtc = criticas.stream().filter{ c ->
            c.id == form.id

        }.findFirst().get()

        criticas = criticas.minus(crtc).plus( Critica(
            id = form.id,
            titulo = form.titulo,
            texto = form.texto,
            livro = crtc.livro,
            usuario = crtc.usuario,
            dataCriacao = crtc.dataCriacao,
            respostas = crtc.respostas,
            status = crtc.status
        )
        )
    }

    fun deletar(id: Long) {

        val crtc = criticas.stream().filter{ c ->
            c.id == id
        }.findFirst().get()
        criticas = criticas.minus(crtc)

    }

}