package com.tcc.simuladorDeConceitos.model;

import jakarta.persistence.*;

import java.util.ArrayList;

@Entity
@Table(name = "disciplina")
public class Disciplina {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ElementCollection(targetClass = Integer.class)
    private ArrayList<Turma> listaTurmas = new ArrayList<>();

    public Disciplina() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Turma> getListaTurmas() {
        return listaTurmas;
    }

    public void setListaTurmas(ArrayList<Turma> listaTurmas) {
        this.listaTurmas = listaTurmas;
    }
}
