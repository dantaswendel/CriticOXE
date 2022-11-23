package br.com.wendel.criticoxe.repository

import br.com.wendel.criticoxe.model.Usuario
import org.springframework.data.jpa.repository.JpaRepository

interface UsuarioRepository : JpaRepository<Usuario,Long>{

}