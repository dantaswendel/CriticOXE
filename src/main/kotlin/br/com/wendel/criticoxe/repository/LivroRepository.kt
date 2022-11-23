package br.com.wendel.criticoxe.repository

import br.com.wendel.criticoxe.model.Livro
import org.springframework.data.jpa.repository.JpaRepository

interface LivroRepository : JpaRepository<Livro, Long> {
}