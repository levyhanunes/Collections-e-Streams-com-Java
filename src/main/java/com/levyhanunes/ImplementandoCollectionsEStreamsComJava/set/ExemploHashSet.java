package com.levyhanunes.ImplementandoCollectionsEStreamsComJava.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExemploHashSet {

    public static void main(String[] args){

        Set<Double> notaAlunos = new HashSet<>();

        //Adicionar notas no set

        notaAlunos.add(4.6);
        notaAlunos.add(9.3);
        notaAlunos.add(3.2);
        notaAlunos.add(5.7);
        notaAlunos.add(7.8);
        notaAlunos.add(7.0);
        notaAlunos.add(9.3);
        notaAlunos.add(8.4);
        notaAlunos.add(6.5);
        notaAlunos.add(6.7);
        notaAlunos.add(4.8);
        notaAlunos.add(9.2);
        notaAlunos.add(7.2);
        notaAlunos.add(10.0);


        System.out.println(notaAlunos);

        //alguns metodos

        //remove
        notaAlunos.remove(3.2);
        System.out.println(notaAlunos);

        //Quantidade de itens size()
        System.out.println(notaAlunos.size());

        Iterator<Double> iterator = notaAlunos.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        for(Double nota: notaAlunos){
            System.out.println(nota);
        }




        //retorna se esta vazio ou não

        System.out.println(notaAlunos.isEmpty());


        //Limpar set
        notaAlunos.clear();

        System.out.println(notaAlunos.isEmpty());
    }
}
