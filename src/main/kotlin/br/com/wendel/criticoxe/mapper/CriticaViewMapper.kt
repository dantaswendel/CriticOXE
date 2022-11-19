package br.com.wendel.criticoxe.mapper

import br.com.wendel.criticoxe.dto.CriticaView
import br.com.wendel.criticoxe.model.Critica
import org.springframework.stereotype.Component

@Component
class CriticaViewMapper : Mapper<Critica,CriticaView> {
    override fun map(c: Critica): CriticaView {
        return CriticaView (
            id = c.id,
            titulo = c.titulo,
            texto = c.texto,
            dataCriacao =c.dataCriacao,
            status = c.status

        )
    }
}