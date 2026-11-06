package br.edu.fatecpg.java.lista.view;
import java.util.List;

import br.edu.fatecpg.java.lista.controller.AlunoController;
import br.edu.fatecpg.java.lista.model.Aluno;

public class Main {
    public static void main(String[] args) {
        AlunoController ac = new AlunoController();
        Aluno a1 = new Aluno(10, "Ale", "DSM", 5);

        ac.setAluno(a1);
        ac.setAluno(new Aluno(40, "Aline", "ADS", 6));
        ac.setAluno(new Aluno(20, "Ana", "DSM", 1));
        ac.setAluno(new Aluno(80, "Maria", "COMEX", 2));

        System.out.println(ac.getAluno(2));
        System.out.println(ac.mostrarAlunos());

        System.out.println("Removendo aluno: ");
        ac.removerAluno(1);

        System.out.println("Nova lista de alunos: ");
        System.out.println(ac.mostrarAlunos());

        System.out.println("Buscando aluno........... ");
        System.out.println(ac.buscarAluno(20));

        ac.passarSemestre();
        System.out.println("\n");
        ac.limparLista();

    }
}