package com.tcc.simuladorDeConceitos.repository;

import com.tcc.simuladorDeConceitos.model.Docente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocenteRepository  extends JpaRepository<Docente,Integer> {
}
