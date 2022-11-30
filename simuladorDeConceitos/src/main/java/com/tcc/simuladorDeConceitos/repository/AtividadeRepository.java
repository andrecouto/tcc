package com.tcc.simuladorDeConceitos.repository;

import com.tcc.simuladorDeConceitos.model.Atividade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AtividadeRepository  extends JpaRepository<Atividade,Integer> {
}