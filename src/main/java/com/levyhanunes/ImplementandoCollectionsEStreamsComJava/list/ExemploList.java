package com.levyhanunes.ImplementandoCollectionsEStreamsComJava.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploList {
    public static void main(String[] args){

        List<String> nomes = new ArrayList<>();

        nomes.add("Levy");
        nomes.add("Rafaela");
        nomes.add("Fabio");
        nomes.add("Raquel");
        nomes.add("Pedro");
        nomes.add("Rose");
        nomes.add("Joao");


        System.out.println(nomes);

        nomes.set(3, "Teste set()");

        System.out.println(nomes);

        Collections.sort(nomes);

        nomes.set(2, "Anderson");

        System.out.println(nomes);

        nomes.remove(4);

        System.out.println(nomes);
    }
}
