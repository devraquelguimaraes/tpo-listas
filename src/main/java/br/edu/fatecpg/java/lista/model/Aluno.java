package br.edu.fatecpg.java.lista.model;

public class Aluno {
    private int matricula;
    private String nome;
    private String curso;
    private int ciclo;

    public Aluno(int matricula, String nome, String curso, int ciclo) {
        this.matricula = matricula;
        this.nome = nome;
        this.curso = curso;
        this.ciclo = ciclo;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getCiclo() {
        return ciclo;
    }

    public void setCiclo(int ciclo) {
        this.ciclo = ciclo;
    }

    @Override
    public String toString() {
        return "Aluno{" + "\nMatricula: " +matricula + "\n Nome: " + nome + "\nCurso: " + curso + "\n Ciclo " + ciclo + "}\n";
    }
}
