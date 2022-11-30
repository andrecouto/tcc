package com.tcc.simuladorDeConceitos.model;


import jakarta.persistence.*;

import java.util.ArrayList;

@Entity
@Table(name = "curso")
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private ArrayList<Docente> listaDocente = new ArrayList<>();

    public Curso() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Docente> getListaDocente() {
        return listaDocente;
    }

    public void setListaDocente(ArrayList<Docente> listaDocente) {
        this.listaDocente = listaDocente;
    }
}
