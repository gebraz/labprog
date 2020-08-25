package com.labprog.patrimonio.model.repositorio;

import com.labprog.patrimonio.model.entidades.Investimento;

import org.springframework.data.jpa.repository.JpaRepository;

public interface InvestimentoRepository 
    extends JpaRepository<Investimento, Long> {

}
    