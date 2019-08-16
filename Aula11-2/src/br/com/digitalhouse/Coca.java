package br.com.digitalhouse;

import java.util.Objects;

public class Coca {

    private Integer tamanho;
    private Double preco;

    public Coca(Integer tamanho, Double preco) {
        this.tamanho = tamanho;
        this.preco = preco;
    }

    public Integer getTamanho() {
        return tamanho;
    }

    public void setTamanho(Integer tamanho) {
        this.tamanho = tamanho;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Coca coca = (Coca) obj;
//        return Objects.equals(tamanho, coca.tamanho) &&
//                Objects.equals(preco, coca.preco);

        return Objects.equals(tamanho, coca.tamanho);

    }

}
