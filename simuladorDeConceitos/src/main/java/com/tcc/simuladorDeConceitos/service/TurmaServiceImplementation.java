package com.tcc.simuladorDeConceitos.service;

import com.tcc.simuladorDeConceitos.model.Turma;
import com.tcc.simuladorDeConceitos.repository.TurmaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TurmaServiceImplementation implements TurmaService{
    @Autowired
    private TurmaRepository turmaRepository;

    @Override
    public Turma saveTurma(Turma turma) {
        return turmaRepository.save(turma);
    }

    @Override
    public List<Turma> getAllTurmas() {
        return turmaRepository.findAll();
    }
}
