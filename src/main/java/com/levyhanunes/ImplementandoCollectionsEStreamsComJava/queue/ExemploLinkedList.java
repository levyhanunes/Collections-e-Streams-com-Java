package com.levyhanunes.ImplementandoCollectionsEStreamsComJava.queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExemploLinkedList {

    public static void main(String[] args){

        Queue<String> filaBanco = new LinkedList<>();

            filaBanco.add("Patricia");
            filaBanco.add("Roberto");
            filaBanco.add("Flavio");
            filaBanco.add("Pamela");
            filaBanco.add("Anderson");

        System.out.println(filaBanco + "\n");
        System.out.println("_________________________________ \n");
        for (String nome: filaBanco) System.out.println(nome + "\n");

        String clienteASerAtendido = filaBanco.poll();

            System.out.println(clienteASerAtendido);
        System.out.println(filaBanco);

        String primeiroCliente = filaBanco.peek();
        System.out.println(primeiroCliente);
        System.out.println(filaBanco);

        //filaBanco.clear();

        //String primeiroClienteOuErro = filaBanco.element();
        //System.out.println(primeiroClienteOuErro);

        System.out.println(filaBanco);

        Iterator<String> interatorFilaBanco = filaBanco.iterator();
        System.out.println(interatorFilaBanco);

        while (interatorFilaBanco.hasNext()) System.out.println("=====>>> " + interatorFilaBanco.next());

    }
}

