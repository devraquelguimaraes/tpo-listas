package br.edu.fatecpg.java.lista.controller;
import java.util.ArrayList;
import java.util.List;
import br.edu.fatecpg.java.lista.model.Aluno;

public class AlunoController {
    private List<Aluno> listaAlunos;

    public AlunoController() {
        listaAlunos = new ArrayList<Aluno>();
    }

    public void setAluno(Aluno a) {
        listaAlunos.add(a);
    }

    public Aluno getAluno(int index) {
        return listaAlunos.get(index); // estamos passando um objeto como parâmetro, algo abstrato que será recebido em outro local pra mostrar as infos do aluno

    }
    public String mostrarAlunos() {
        StringBuilder sb = new StringBuilder();
        for (Aluno a : listaAlunos) {
            sb.append(a.toString()+"\n");
        }
        return sb.toString();
    }

    public void removerAluno(int index) {
        try{
            listaAlunos.remove(index);
        System.out.println("Aluno removido");
        }catch (Exception e){
            System.out.println("Erro ao remover aluno");
        }
    }

    public void passarSemestre(){
        for (Aluno a : listaAlunos) {
            a.setCiclo(a.getCiclo()+1);
        }
        System.out.println("Semestre avançado");
    }

    public String buscarAluno(int matricula){
        for (Aluno a : listaAlunos) {
            if(a.getMatricula() == matricula){
                return "Aluno encontrado";
            }
        }
        return "Aluno não encontrado";
    }

    public void limparLista() {
        listaAlunos.clear();
        System.out.println("Lista de alunos limpa");
    }
}
