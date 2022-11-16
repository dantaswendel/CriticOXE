package br.com.wendel.criticoxe.mapper

import br.com.wendel.criticoxe.dto.CriticaForm
import br.com.wendel.criticoxe.dto.CriticaView
import br.com.wendel.criticoxe.model.Critica
import br.com.wendel.criticoxe.service.LivroService
import br.com.wendel.criticoxe.service.UsuarioService
import org.springframework.stereotype.Component

@Component
class CriticaFormMapper (

   private val livroService : LivroService,
   private val usuarioService: UsuarioService

) : Mapper<CriticaForm, Critica > {
    override fun map(c: CriticaForm):Critica  {
        return Critica(
                titulo =c.titulo,
                texto = c.texto,
                livro = livroService.buscarPorId(c.idLivro),
                usuario = usuarioService.buscarPorId(c.idUsuario)
            )


    }
}
