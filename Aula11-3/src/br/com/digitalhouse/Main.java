package br.com.digitalhouse;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Rodrigo", 123);
        Aluno aluno2 = new Aluno("Eliza", 123);
        Aluno aluno3 = new Aluno("Felipe", 123);
        Aluno aluno4 = new Aluno("Larissa", 123);

        List<Aluno> alunos = new ArrayList<>();
        alunos.add(aluno1);
        alunos.add(aluno2);
        alunos.add(aluno3);
        alunos.add(aluno4);

        System.out.println(alunos);




    }


}
