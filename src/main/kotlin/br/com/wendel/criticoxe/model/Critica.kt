package br.com.wendel.criticoxe.model

import java.time.LocalDateTime
import javax.persistence.*

@Entity
data class Critica @JvmOverloads constructor(
   @Id @GeneratedValue (strategy = GenerationType.IDENTITY)
     var id: Long? = null,
    val titulo: String,
    val texto: String,
    val dataCriacao: LocalDateTime = LocalDateTime.now(),
   @ManyToOne
    val livro:Livro,
   @ManyToOne
   val usuario: Usuario,
   @Enumerated(value = EnumType.STRING)
    val status: StatusCritica = StatusCritica.NAO_RESPONDIDO,
   @OneToMany(mappedBy = "critica")
    val respostas: List<Resposta> = ArrayList()
        )
