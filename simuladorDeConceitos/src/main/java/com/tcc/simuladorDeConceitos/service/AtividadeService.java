package com.tcc.simuladorDeConceitos.service;

import com.tcc.simuladorDeConceitos.model.Atividade;

import java.util.List;

public interface AtividadeService {
    public Atividade saveAtividade(Atividade atividade);
    public List<Atividade> getAllAtividades();
}
