package com.labprog.patrimonio.model.repositorio;

import com.labprog.patrimonio.model.entidades.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository 
        extends JpaRepository<Usuario, Long>{
    
}