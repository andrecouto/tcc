package com.tcc.simuladorDeConceitos.service;

import com.tcc.simuladorDeConceitos.model.Docente;

import java.util.List;

public interface DocenteService {
    public Docente saveDocente(Docente docente);
    public List<Docente> getAllDocentes();
}
