package com.levyhanunes.ImplementandoCollectionsEStreamsComJava.set;

import java.util.TreeSet;

public class ExemploTreeSet {

    public static void main(String[]args){

        TreeSet<String> treeCapitais = new TreeSet<>();

        treeCapitais.add("Porto Alegre");
        treeCapitais.add("Florianopolis");
        treeCapitais.add("São Paulo");
        treeCapitais.add("Rio de Janeiro");
        treeCapitais.add("Cuiaba");
        treeCapitais.add("Curitiba");
        treeCapitais.add("Belo Horizonte");


        System.out.println(treeCapitais);

        //retorna o primeiro elemento do topo da arvore

        System.out.println(treeCapitais.first());


        //retorna o ultimo elemento da arvove

        System.out.println(treeCapitais.last());

        //retorna a primeira capital acima da arvore da capital parametrizada
        System.out.println(treeCapitais.higher("Curitiba"));

        //retorna a primeira capital a baixo da arvore da capital parametrizada
        System.out.println(treeCapitais.lower("Curitiba"));

        //

    }
}
