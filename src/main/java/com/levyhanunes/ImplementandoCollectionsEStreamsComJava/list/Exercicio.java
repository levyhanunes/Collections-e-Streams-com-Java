package com.levyhanunes.ImplementandoCollectionsEStreamsComJava.list;

import java.util.ArrayList;
import java.util.List;

public class Exercicio {

    public static void main(String[] args){

        List<String> exercicioNomes = new ArrayList<>();

        exercicioNomes.add("Juliana");
        exercicioNomes.add("Pedro");
        exercicioNomes.add("Carlos");
        exercicioNomes.add("Larissa");
        exercicioNomes.add("João");


        for(String nome: exercicioNomes) System.out.println(nome);

        exercicioNomes.set(2, "Roberto");

        System.out.println(exercicioNomes.get(1));

        exercicioNomes.remove(4);

        exercicioNomes.remove("João");

        int tamanho = exercicioNomes.size();

        System.out.println(tamanho);

        boolean contemJuliano = exercicioNomes.contains("Juliano");

        System.out.println(contemJuliano);


    }
}
