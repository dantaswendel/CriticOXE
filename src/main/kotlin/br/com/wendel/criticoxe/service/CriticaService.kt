package br.com.wendel.criticoxe.service

import br.com.wendel.criticoxe.dto.AtualizacaoCriticaForm
import br.com.wendel.criticoxe.dto.CriticaForm
import br.com.wendel.criticoxe.dto.CriticaView
import br.com.wendel.criticoxe.mapper.CriticaFormMapper
import br.com.wendel.criticoxe.mapper.CriticaViewMapper
import br.com.wendel.criticoxe.model.Critica
import br.com.wendel.criticoxe.repository.CriticaRepository
import org.springframework.data.crossstore.ChangeSetPersister
import org.springframework.stereotype.Service
import java.util.*
import java.util.stream.Collectors


@Service
class CriticaService (
    private val repository: CriticaRepository,
    private val criticaviewMapper: CriticaViewMapper,
    private val criticaformMapper : CriticaFormMapper,

) {

    fun listar(): List<CriticaView>? {
        return repository.findAll().stream().map { c -> criticaviewMapper.map(c) }.collect(Collectors.toList())
    }

    fun buscarporId(id: Long): CriticaView {
        val crtc = repository.findAll(id)
        return criticaviewMapper.map(crtc)

    }

    fun cadastrar(form: CriticaForm): CriticaView {
        val critica = criticaformMapper.map(form)
        repository.save(critica)
        return criticaviewMapper.map(critica)
    }

    fun atualizar(form: AtualizacaoCriticaForm): CriticaView {
        //recuperando Critica
        val critica = repository.findAll(form.id)
        critica.titulo = form.titulo
        critica.texto = form.texto
        return criticaviewMapper.map(critica)

    }

    fun deletar(id: Long): CriticaRepository {
        repository.deleteById(id)
        return repository
    }
}
