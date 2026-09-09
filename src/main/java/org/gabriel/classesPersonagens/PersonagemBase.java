package org.gabriel.classesPersonagens;

import org.gabriel.classesMecanicas.Atributos;
import org.gabriel.classesMecanicas.Inventario;
import org.gabriel.classesMecanicas.Item;

public class PersonagemBase {
    protected int vida;
    protected int defesa;
    protected Roles role;
    protected int dano;
    protected int defesaMagica;
    protected int mana;
    protected String nomeBuff;
    protected double porcentagemBuff;
    protected double dinheiro;
    protected Inventario inventario;
    protected Atributos atributos;
    private Cenario cenarioAtual;

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

    public void criaAtributos() {
        //this.atributos = new Atributos();
        //atributos.atributosInit(role);
    }
}

