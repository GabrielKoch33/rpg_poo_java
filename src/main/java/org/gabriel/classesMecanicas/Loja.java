package org.gabriel.classesMecanicas;

import javax.swing.*;
import java.util.HashMap;

public class Loja {
    /** Essa é a classe que menos tenho domínio, pois nesse momento ainda não vi construtores, estruturas (map, set, list)
     * e seus métodos/funcionalidades.
     * A ideia é que a loja seja uma hash table onde cada 'key : value' é: item.nome e item.custo respectivamente
     * */
    private final HashMap<String, Item> store;

    public Loja() {
        this.store = new HashMap<>();
    }

    public void printAllItens() {
        store.forEach((itemName, item) ->
            System.out.println("Item: " + itemName +
                            " || Custo:" + item.getCost() +
                            " || Peso: " + item.getWeight() +
                            " || Usos Máximos: " + item.getNumberOfMaxUses()));
    }
}

