package org.gabriel.classesPersonagens;

import org.gabriel.classesMecanicas.Atributos;
import org.gabriel.classesMecanicas.Inventario;
import org.gabriel.classesMecanicas.Item;

import java.awt.event.InvocationEvent;

public class PersonagemBase {
    protected Roles role;
    protected String nomeBuff;
    protected double porcentagemBuff;
    protected double dinheiro;
    protected Inventario inventario;
    protected Atributos atributos;
    private Cenario cenarioAtual;

    public PersonagemBase() {
        this.inventario = new Inventario();
        this.dinheiro = 50.0;
        this.cenarioAtual = Cenario.DIALOGO;
    }

    enum Cenario {
        LOJA,
        DIALOGO,
        COMBATE,
        INVENTARIO,
    }
    enum Roles {
        ARQUEIRO,
        BANDIDO,
        FEITICEIRO,
        GUERREIRO
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

