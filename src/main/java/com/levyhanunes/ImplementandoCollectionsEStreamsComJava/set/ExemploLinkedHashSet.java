package com.levyhanunes.ImplementandoCollectionsEStreamsComJava.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class ExemploLinkedHashSet {

    public static void main(String[] args){

        LinkedHashSet<Integer> sequenciaNumerica = new LinkedHashSet<>();

        sequenciaNumerica.add(1);
        sequenciaNumerica.add(2);
        sequenciaNumerica.add(4);
        sequenciaNumerica.add(8);
        sequenciaNumerica.add(16);

        System.out.println(sequenciaNumerica);

        //remove
        sequenciaNumerica.remove(4);
        System.out.println(sequenciaNumerica);

        //quantidade de itens do set
        System.out.println(sequenciaNumerica.size());


        //navegar em todos os itens do iterator

        Iterator<Integer> iterator = sequenciaNumerica.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        } for (Integer numero : sequenciaNumerica){
            System.out.println( "---> " + numero);
        }

        //retorna se esta vazio ou nao

        System.out.println(sequenciaNumerica.isEmpty());


        //clear
        sequenciaNumerica.clear();
        System.out.println(sequenciaNumerica.isEmpty());



    }
}
