package com.tcc.simuladorDeConceitos.service;

import com.tcc.simuladorDeConceitos.model.Docente;
import com.tcc.simuladorDeConceitos.repository.DocenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocenteServiceImplementation implements DocenteService{
    @Autowired
    private DocenteRepository docenteRepository;

    @Override
    public Docente saveDocente(Docente docente) {
        return docenteRepository.save(docente);
    }

    @Override
    public List<Docente> getAllDocentes() {
        return docenteRepository.findAll();
    }
}
