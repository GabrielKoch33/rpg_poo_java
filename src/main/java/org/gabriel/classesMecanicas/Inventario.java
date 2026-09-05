package org.gabriel.classesMecanicas;

public class Inventario {
    final private int iSlots;
    private Item[] inventory;
    private int sumWeigth;

    public Inventario(int iMaxSlots){
        this.iSlots = iMaxSlots;
        inventory = new Item[iMaxSlots];
    }

    public int getInventorySlots() {
        return this.iSlots;
    }

    public boolean addItem(Item item) {
        // ao adicionar um item incrementamos o valor do peso total da mochila
        return true;
    }

    public boolean removeItem(Item item) {
        // ao adicionar um item decrementamos o valor do peso total da mochila
        return true;
    }

    public boolean isFull() {
        if (this.sumWeigth == this.iSlots) {
            System.out.println("Inventário cheio! Venda alguns itens");
            return true;
        }
        System.out.println("Inventário com espaços livres!");
        return false;
    }
}
