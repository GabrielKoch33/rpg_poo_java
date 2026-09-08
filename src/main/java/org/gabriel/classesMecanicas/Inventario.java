package org.gabriel.classesMecanicas;

import java.util.Map;
import java.util.HashMap;

public class Inventario {
    private int tamanhoAtual;
    private int pesoAtual;
    private int ultimaChaveCriada = 1;
    private final Map<Integer, Item> inventario;

    public Inventario(){
        this.inventario = new HashMap<>();
    }

    public Item guardarItem(Item item) {
        int espacosLivres = calculaPesoPermitidoAlocar();
        int tamanhoMaxInventario = 30;
        if (this.inventario.size() < tamanhoMaxInventario && item.getPeso() < espacosLivres) {
            this.inventario.put(this.ultimaChaveCriada, item);
            this.ultimaChaveCriada++;
            this.pesoAtual = calculaPesoAtual();
            return item;
        }
        return null;
    }

    public Item descartarItem(int id) {
        if (this.inventario.isEmpty() || !inventario.containsKey(id)) {
            return null;
        }
        Item itemRemovido = this.inventario.remove(id);
        this.pesoAtual = calculaPesoAtual();
        return itemRemovido;

    }

    public int calculaPesoAtual() {
        int pesoAtual = 0;
        for (Item item : this.inventario.values()) {
            pesoAtual += item.getPeso();
        }
        return pesoAtual;
    }

    public int calculaPesoPermitidoAlocar() {
        int pesoMaxInventario = 25;
        return pesoMaxInventario % calculaPesoAtual();
    }

}

