package com.tcc.simuladorDeConceitos.repository;

import com.tcc.simuladorDeConceitos.model.Disciplina;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DisciplinaRepository  extends JpaRepository<Disciplina,Integer> {
}