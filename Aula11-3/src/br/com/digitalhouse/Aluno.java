package br.com.digitalhouse;

import java.util.Objects;

public class Aluno {

    private String nome;
    private Integer numeroDeAluno;

    public Aluno (String nome, Integer numeroDeAluno){
        this.nome = nome;
        this.numeroDeAluno = numeroDeAluno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumeroDeAluno() {
        return numeroDeAluno;
    }

    public void setNumeroDeAluno(Integer numeroDeAluno) {
        this.numeroDeAluno = numeroDeAluno;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Aluno aluno = (Aluno) obj;
        return Objects.equals(nome, aluno.nome) &&
                Objects.equals(numeroDeAluno, aluno.numeroDeAluno);


//        return Objects.equals(numeroDeAluno, aluno.numeroDeAluno);


    }

}
