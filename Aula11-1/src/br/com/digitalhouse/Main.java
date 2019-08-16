package br.com.digitalhouse;

import com.sun.org.apache.xpath.internal.operations.Equals;

public class Main {

    public static void main(String[] args) {

        Pessoa rodrigo = new Pessoa("RODRIGO", 12345);
        Pessoa eliza = new Pessoa("ELIZA", 12345);

        System.out.println(rodrigo.equals(eliza));

    }

}
