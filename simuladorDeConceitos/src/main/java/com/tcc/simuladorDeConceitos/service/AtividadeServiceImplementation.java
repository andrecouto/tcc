package com.tcc.simuladorDeConceitos.service;

import com.tcc.simuladorDeConceitos.model.Atividade;
import com.tcc.simuladorDeConceitos.repository.AtividadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AtividadeServiceImplementation implements AtividadeService{
    @Autowired
    private AtividadeRepository atividadeRepository;

    @Override
    public Atividade saveAtividade(Atividade atividade) {
        return atividadeRepository.save(atividade);
    }

    @Override
    public List<Atividade> getAllAtividades() {
        return atividadeRepository.findAll();
    }
}
