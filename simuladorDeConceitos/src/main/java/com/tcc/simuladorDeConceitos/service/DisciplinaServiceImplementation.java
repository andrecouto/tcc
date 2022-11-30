package com.tcc.simuladorDeConceitos.service;

import com.tcc.simuladorDeConceitos.model.Disciplina;
import com.tcc.simuladorDeConceitos.repository.DisciplinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DisciplinaServiceImplementation implements DisciplinaService{
    @Autowired
    private DisciplinaRepository disciplinaRepository;

    @Override
    public Disciplina saveDisciplina(Disciplina disciplina) {
        return disciplinaRepository.save(disciplina);
    }

    @Override
    public List<Disciplina> getAllDisciplinas() {
        return disciplinaRepository.findAll();
    }
}
