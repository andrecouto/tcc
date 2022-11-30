package com.tcc.simuladorDeConceitos.model;

import jakarta.persistence.*;

import java.util.ArrayList;

@Entity
@Table(name = "turma")
public class Turma {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Docente docente;
    private ArrayList<Atividade> listaAtividades = new ArrayList<>();

    public Turma() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
