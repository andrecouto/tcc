package com.tcc.simuladorDeConceitos.service;

import com.tcc.simuladorDeConceitos.model.Curso;
import com.tcc.simuladorDeConceitos.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoServiceImplementation implements CursoService{
    @Autowired
    private CursoRepository cursoRepository;

    @Override
    public Curso saveCurso(Curso curso) {
        return cursoRepository.save(curso);
    }

    @Override
    public List<Curso> getAllCursos() {
        return cursoRepository.findAll();
    }
}
