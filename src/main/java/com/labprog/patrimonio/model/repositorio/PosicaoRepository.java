package com.labprog.patrimonio.model.repositorio;

import com.labprog.patrimonio.model.entidades.Posicao;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PosicaoRepository 
        extends JpaRepository<Posicao, Long> {
    
}