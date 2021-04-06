package com.levyhanunes.ImplementandoCollectionsEStreamsComJava.map;

import javax.servlet.ServletOutputStream;
import java.util.HashMap;
import java.util.Map;

public class ExemploMap {

    public static void main(String[] args){

        Map<String, Integer> campeoesMundiais = new HashMap<>();

        campeoesMundiais.put("Brasil", 5);
        campeoesMundiais.put("Alemanha", 4);
        campeoesMundiais.put("Itália", 4);
        campeoesMundiais.put("Uruguai", 2);
        campeoesMundiais.put("Argentina", 2);
        campeoesMundiais.put("França", 2);
        campeoesMundiais.put("Inglaterra", 1);
        campeoesMundiais.put("Espanha", 1);

        System.out.println(campeoesMundiais);

        //Atualiza o valor da chave Brasil
        campeoesMundiais.put("Brasil", 6);

        System.out.println(campeoesMundiais);

        //Retorna a Argentina

        System.out.println(campeoesMundiais.get("Argentina"));
        System.out.println(campeoesMundiais);


        //Retorna se existe  ou nao um campeãoFrança

        System.out.println(campeoesMundiais.containsKey("França"));

        //Remove França

        campeoesMundiais.remove("França");

        //Retorna se existe  ou nao um campeãoFrança

        System.out.println(campeoesMundiais.containsKey("França"));

        // Retorna se existe ou nao um Hexa campeão
        System.out.println(campeoesMundiais.containsValue(6));


        //retorna o tamanho do mapa
        System.out.println(campeoesMundiais.size());

        System.out.println(campeoesMundiais);

        //Navegar nos registros do mapa

        for (Map.Entry<String, Integer> entry : campeoesMundiais.entrySet()){
            System.out.println(entry.getKey() + " -- " + entry.getValue());
        }

        for (String key : campeoesMundiais.keySet()) {
            System.out.println(key + " -- " + campeoesMundiais.get(key));
        }

        System.out.println(campeoesMundiais);


        //verifica se contem os estados unidos
        System.out.println("Estados Unidos");


        //verifica se contem o valor 5
        System.out.println(campeoesMundiais.containsValue(5));
    }
}
