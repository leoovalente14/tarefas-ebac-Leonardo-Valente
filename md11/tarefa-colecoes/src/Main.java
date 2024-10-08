import java.util.Collections;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    List<String> listaAlunos = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);
    String nomes;

    System.out.println("Digite o nome dos alunos separado por vírgula: ");
    nomes = scanner.nextLine();
    String[] nomesAlunos = nomes.split(",");
    for (String nomeAluno : nomesAlunos) {
        nomeAluno = nomeAluno.trim();
        listaAlunos.add(nomeAluno);
    }
    Collections.sort(listaAlunos);
    for (String nomeAluno: nomesAlunos) {
        System.out.println(nomeAluno);
        }

    List<String> listaAlunosF = new ArrayList<>();
    List<String> listaAlunosM = new ArrayList<>();

    System.out.println("Digite o nome dos alunos seguidos de M para homens e F para mulheres, utilizando a vírgula para separar os nomes!;");
    System.out.println("Exemplo: Leonardo Valente M, Ana Maria F ");
    String entradaAlunos = scanner.nextLine();
    String[] alunos = entradaAlunos.split(",");

    for (String aluno : alunos) {
        aluno = aluno.trim();
        int indiceUltimoEspaco  = aluno.lastIndexOf(" ");

        if(indiceUltimoEspaco !=-1){
            String nome = aluno.substring(0, indiceUltimoEspaco).trim();
            String genero = aluno.substring(indiceUltimoEspaco + 1).trim().toUpperCase();

        if (genero.equals("M")){
            listaAlunosM.add(nome);
        } else if (genero.equals("F")){
            listaAlunosF.add(nome);
        } else {
            System.out.println("Gênero inválido para" + nome + ". Ignorando!");
        }

        } else {
            System.out.println("Formato inválido para" + aluno + ". Deve haver um nome seguido de um gênero M ou F!");
        }
    }

    System.out.println("Lista de Homens:");
    for (String nome: listaAlunosM) {
        System.out.println(nome);
    }

    System.out.println("Lista de Mulheres:");
    for (String nome: listaAlunosF) {
        System.out.println(nome);
    }

    scanner.close();

    }

}