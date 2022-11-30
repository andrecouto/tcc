package com.tcc.simuladorDeConceitos.service;

import com.tcc.simuladorDeConceitos.model.Disciplina;

import java.util.List;

public interface DisciplinaService {
    public Disciplina saveDisciplina(Disciplina disciplina);
    public List<Disciplina> getAllDisciplinas();
}
