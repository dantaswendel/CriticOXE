package br.com.wendel.criticoxe.repository

import br.com.wendel.criticoxe.model.Critica
import org.springframework.data.jpa.repository.JpaRepository

interface CriticaRepository  : JpaRepository<Critica,Long>{
    abstract fun findAll(id: Long): Critica

}