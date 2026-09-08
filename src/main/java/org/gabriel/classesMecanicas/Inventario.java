package org.gabriel.classesMecanicas;

import java.util.Map;
import java.util.HashMap;

public class Inventario {
    private final int tamanhoMaxInventario = 30;
    private final Map<Integer, Item> inventario;
    private final int pesoMaxInventario = 25;
    private int ultimaChaveCriada = 1;

    public Inventario(){
        this.inventario = new HashMap<>();
    }

    public Item guardarItem(Item item){
        this.inventario.put(this.ultimaChaveCriada, item);
        this.ultimaChaveCriada++;
        return item;
    }

    public Item descartarItem(int id){
        if (this.inventario.isEmpty() || !inventario.containsKey(id)){
            return null;
        }
        return this.inventario.remove(id);
    }

    public boolean calculaPesoAtual(){
        return false;
    }

    public boolean calculaEspacosLivres(){
        return false;
        // 30 - size
    }

}

