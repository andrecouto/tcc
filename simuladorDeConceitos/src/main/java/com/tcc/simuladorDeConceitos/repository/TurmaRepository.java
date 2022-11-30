package com.tcc.simuladorDeConceitos.repository;

import com.tcc.simuladorDeConceitos.model.Turma;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TurmaRepository  extends JpaRepository<Turma,Integer> {
}
