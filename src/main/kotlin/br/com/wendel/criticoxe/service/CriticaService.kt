package br.com.wendel.criticoxe.service

import br.com.wendel.criticoxe.dto.CriticaDto
import br.com.wendel.criticoxe.model.Critica
import org.springframework.stereotype.Service
import java.util.*


@Service
class CriticaService (
    private var criticas: List<Critica> = ArrayList(),
    private val livroService : LivroService,
    private val usuarioService: UsuarioService
) {

   fun listar(): List<Critica> {
return criticas
    }

    fun buscarporId(id: Long): Critica {
return criticas.stream().filter({
    t -> t.id == id

}).findFirst().get()
    }

    fun cadastrar(dto: CriticaDto) {
criticas.plus(Critica(
    id = criticas.size.toLong() +1,
    titulo =dto.titulo,
    texto = dto.texto,
    livro = livroService.buscarPorId(dto.idLivro),
    usuario = usuarioService.buscarPorId(dto.idUsuario)
))
    }

}