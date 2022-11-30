package com.tcc.simuladorDeConceitos.repository;

import com.tcc.simuladorDeConceitos.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CursoRepository  extends JpaRepository<Curso,Integer> {
}