package org.gabriel.classesMecanicas;

import java.util.LinkedHashSet;
import java.util.Set;

public class Inventario {
    private final int tamanhoInventario = 30;
    private final Set<Item> inventario;
    private int pesoTotalInventario = 0;

    public Inventario(){
        this.inventario = new LinkedHashSet<Item>();
    }

    public boolean guardarItem(Item item){
        return false;
    }

    public boolean descartarItem(Item item){
        return false;
    }

    public boolean calculaPesoAtual(){
        return false;
    }

    public boolean calculaEspacosLivres(){
        return false;
        // 30 - size
    }

}

