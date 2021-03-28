package com.levyhanunes.ImplementandoCollectionsEStreamsComJava.list;

import java.util.List;
import java.util.Vector;

public class ExemploVector {

    public static void main(String[] args){
        List<String> esportes = new Vector<>();

        esportes.add("Futebol");
        esportes.add("Tenis");
        esportes.add("ESports");
        esportes.add("Ciclismo");
        esportes.add("Musculação");

        esportes.set(2, "Ping Pong");

        esportes.remove("Musculação");

        System.out.println(esportes.get(0));

        for(String esporte: esportes) System.out.println(esporte);
    }
}
