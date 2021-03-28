package com.levyhanunes.ImplementandoCollectionsEStreamsComJava.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {

    public static void main(String[] args){


        List<String> nomes1 = new ArrayList<>();

        List<String> nomes = new ArrayList<>();

        nomes.add("Levy");
        nomes.add("Rafaela");
        nomes.add("Fabio");
        nomes.add("Raquel");
        nomes.add("Pedro");
        nomes.add("Rose");
        nomes.add("Joao");


        System.out.println(nomes);

        nomes.set(3, "Oliver");

        System.out.println(nomes);

        Collections.sort(nomes);

        nomes.set(2, "Anderson");

        System.out.println(nomes);

        nomes.remove(4);

        System.out.println(nomes);

        nomes.remove("Pedro");

        System.out.println(nomes);

        String nome = nomes.get(1);

        System.out.println(nomes);

        int tamanho = nomes.size();

        System.out.println(tamanho);

        boolean temLevy = nomes.contains("Levy");

        System.out.println(temLevy);

        boolean temRafaela = nomes.contains("Rafaela");

        System.out.println(temRafaela);

        boolean listaEstaVazia = nomes.isEmpty();

        System.out.println(listaEstaVazia);

        boolean listaEstaVazia1 = nomes1.isEmpty();

        System.out.println(listaEstaVazia1);

        int  existeOliver = nomes.indexOf("Oliver");
        System.out.println(existeOliver);

        for (String nomeDoItem: nomes) {
            System.out.println("---> " + nomeDoItem);
        }

        Iterator<String> iterator = nomes.iterator();

        while  (iterator.hasNext()){
            System.out.println("----> " + iterator.next());
        }
    }
}
