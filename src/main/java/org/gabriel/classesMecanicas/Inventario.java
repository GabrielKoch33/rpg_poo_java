package org.gabriel.classesMecanicas;

public class Inventario {
    private final int slots;
    private final Item[] inventory;
    private int sumWeigth;

    public Inventario(int maxSlots){
        this.slots     = maxSlots;
        this.inventory = new Item[maxSlots];
        this.sumWeigth = 0;
    }

    public int getInventorySlots() {
        return this.slots;
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
        if (this.sumWeigth == this.slots) {
            System.out.println("Inventário cheio! Venda alguns itens");
            return true;
        }
        System.out.println("Inventário com espaços livres!");
        return false;
    }
}
