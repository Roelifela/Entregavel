package br.com.digitalhouse;

import java.util.ArrayList;
import java.util.List;

public class DigitalHouseManager {

    private List<Aluno> listaDeAlunos = new ArrayList<>();
    private List<Professor> listaDeProfessor = new ArrayList<>();
    private List<Curso> listaDeCurso = new ArrayList<>();
    private List<Matricula> listaDeMatricula = new ArrayList<>();

    public DigitalHouseManager(List<Aluno> listaDeAlunos, List<Professor> listaDeProfessor, List<Curso> listaDeCurso, List<Matricula> listaDeMatricula) {
        this.listaDeAlunos = listaDeAlunos;
        this.listaDeProfessor = listaDeProfessor;
        this.listaDeCurso = listaDeCurso;
        this.listaDeMatricula = listaDeMatricula;
    }

    public List<Aluno> getListaDeAlunos() {
        return listaDeAlunos;
    }

    public void setListaDeAlunos(List<Aluno> listaDeAlunos) {
        this.listaDeAlunos = listaDeAlunos;
    }

    public List<Professor> getListaDeProfessor() {
        return listaDeProfessor;
    }

    public void setListaDeProfessor(List<Professor> listaDeProfessor) {
        this.listaDeProfessor = listaDeProfessor;
    }

    public List<Curso> getListaDeCurso() {
        return listaDeCurso;
    }

    public void setListaDeCurso(List<Curso> listaDeCurso) {
        this.listaDeCurso = listaDeCurso;
    }

    public List<Matricula> getListaDeMatricula() {
        return listaDeMatricula;
    }

    public void setListaDeMatricula(List<Matricula> listaDeMatricula) {
        this.listaDeMatricula = listaDeMatricula;
    }

}
