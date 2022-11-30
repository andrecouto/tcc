package com.tcc.simuladorDeConceitos.service;

import com.tcc.simuladorDeConceitos.model.Turma;

import java.util.List;

public interface TurmaService {
    public Turma saveTurma(Turma turma);
    public List<Turma> getAllTurmas();
}
