package com.tcc.simuladorDeConceitos.service;

import com.tcc.simuladorDeConceitos.model.Curso;

import java.util.List;

public interface CursoService {
    public Curso saveCurso(Curso curso);
    public List<Curso> getAllCursos();
}
