package com.tcc.simuladorDeConceitos.model;

import jakarta.persistence.*;

import java.time.LocalDate;


@Entity
@Table(name = "docente")
public class Docente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    private Long CPF;

    //private int cursoId;
    private boolean pertenceNDE;
    private String linkLattes;
    private int matricula;
    private String maiorTitulacao;
    private String maiorTitulacaoAreaCurso;
    private boolean graduadoDireito;
    private int tempoMagisterio;
    private int tempoExpProfissional;
    private int numeroDisciplinas;
    private int publicacoesTresUltimosAnos;

    //private SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
    //@Temporal(TemporalType.DATE)
    //private Date dataAdmissao; // date sql? **********************
    LocalDate dataAdmissao = LocalDate.now();
    private int cargaHorariaExtra;


    public Docente() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getCPF() {
        return CPF;
    }

    public void setCPF(long CPF) {
        this.CPF = CPF;
    }
/*
    public int getCursoId() {
        return cursoId;
    }

    public void setCursoId(int cursoId) {
        this.cursoId = cursoId;
    }
*/
    public boolean isPertenceNDE() {
        return pertenceNDE;
    }

    public void setPertenceNDE(boolean pertenceNDE) {
        this.pertenceNDE = pertenceNDE;
    }

    public String getLinkLattes() {
        return linkLattes;
    }

    public void setLinkLattes(String linkLattes) {
        this.linkLattes = linkLattes;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getMaiorTitulacao() {
        return maiorTitulacao;
    }

    public void setMaiorTitulacao(String maiorTitulacao) {
        this.maiorTitulacao = maiorTitulacao;
    }

    public String getMaiorTitulacaoAreaCurso() {
        return maiorTitulacaoAreaCurso;
    }

    public void setMaiorTitulacaoAreaCurso(String maiorTitulacaoAreaCurso) {
        this.maiorTitulacaoAreaCurso = maiorTitulacaoAreaCurso;
    }

    public boolean isGraduadoDireito() {
        return graduadoDireito;
    }

    public void setGraduadoDireito(boolean graduadoDireito) {
        this.graduadoDireito = graduadoDireito;
    }

    public int getTempoMagisterio() {
        return tempoMagisterio;
    }

    public void setTempoMagisterio(int tempoMagisterio) {
        this.tempoMagisterio = tempoMagisterio;
    }

    public int getTempoExpProfissional() {
        return tempoExpProfissional;
    }

    public void setTempoExpProfissional(int tempoExpProfissional) {
        this.tempoExpProfissional = tempoExpProfissional;
    }

    public int getNumeroDisciplinas() {
        return numeroDisciplinas;
    }

    public void setNumeroDisciplinas(int numeroDisciplinas) {
        this.numeroDisciplinas = numeroDisciplinas;
    }

    public int getPublicacoesTresUltimosAnos() {
        return publicacoesTresUltimosAnos;
    }

    public void setPublicacoesTresUltimosAnos(int publicacoesTresUltimosAnos) {
        this.publicacoesTresUltimosAnos = publicacoesTresUltimosAnos;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(LocalDate dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }


    public int getCargaHorariaExtra() {
        return cargaHorariaExtra;
    }

    public void setCargaHorariaExtra(int cargaHorariaExtra) {
        this.cargaHorariaExtra = cargaHorariaExtra;
    }
}
