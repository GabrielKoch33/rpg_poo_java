package org.gabriel.classesPersonagens;

import org.gabriel.classesMecanicas.Atributos;
import org.gabriel.classesMecanicas.Inventario;
import org.gabriel.classesMecanicas.Item;

public class PersonagemBase {
    private int vida;
    private int defesa;
    private int dano;
    private int defesaMagica;
    private int mana;
    private String nomeBuff;
    private double porcentagemBuff;
    private double dinheiro;
    private Inventario inventario;
    private Atributos atributos;
    private Cenario cenarioAtual;

    enum Cenario {
        LOJA,
        DIALOGO,
        COMBATE,
        INVENTARIO,
    }

    public boolean temDinheiro(Item item) {
        return this.dinheiro < item.getPreco();
    }

    public void gastarDinheiro(Item item) {
        this.dinheiro += item.getPreco();
    }
    public void receberDinheiro(Item item) {
        this.dinheiro += item.getPreco();
    }
}

