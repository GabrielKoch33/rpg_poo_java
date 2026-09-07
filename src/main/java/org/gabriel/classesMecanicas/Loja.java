package org.gabriel.classesMecanicas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Loja {
    /**Integer: será como um índice do item, uma forma rápida de acessar o item desejado. <br>
     * Item: ao escolher um índice iremos escrever um quadro com Nome, Descrição entre outras informações úteis.
     * <br><br>
     * Como boa prática e ligibilidade, iniciamos a variável como Map, depois instânciamos como HashMap**/
    private final Map<Integer, Item> estoque;
    private int ultimaChaveCriada = 1;

    public Loja() {
        this.estoque = new HashMap<>();
    }
    /** Java por debaixo dos panos converte int -> Integer dessa forma:<br>
     this.estoque.put(Integer.valueOf(this.ultimaChaveCriada), item);
     **/
    public void adicionaItemEstoque(Item item) {
        this.estoque.put(this.ultimaChaveCriada, item);
        System.out.println(estoque.get(ultimaChaveCriada).getNome() + " foi adicionado!");
        this.ultimaChaveCriada++;
    }

    public void removeItemEstoque(int id){
        System.out.println(estoque.get(id).getNome() + " foi removido!");
        estoque.remove(id);
    }

    public double venderItem (Item item){
        return item.getPreco();
    }

    public Item comprarItem(int id){
        if (estaVazia() || !contemItem(id)){
            return null;
        } else {
            return estoque.remove(id);
            // lógica para inserir no inventário fica na main
        }
    }

    public boolean estaVazia(){
        return getEstoque().isEmpty();
    }

    public boolean contemItem(int id){
        return this.estoque.containsKey(id);
    }

    public Map<Integer, Item> getEstoque() {
        return estoque;
    }
}

