package org.gabriel.classesPersonagens;

import org.gabriel.classesMecanicas.Atributos;
import org.gabriel.classesMecanicas.Inventario;

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

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public int getDefesaMagica() {
        return defesaMagica;
    }

    public void setDefesaMagica(int defesaMagica) {
        this.defesaMagica = defesaMagica;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public String getNomeBuff() {
        return nomeBuff;
    }

    public void setNomeBuff(String nomeBuff) {
        this.nomeBuff = nomeBuff;
    }

    public double getPorcentagemBuff() {
        return porcentagemBuff;
    }

    public void setPorcentagemBuff(double porcentagemBuff) {
        this.porcentagemBuff = porcentagemBuff;
    }

    public double getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(double dinheiro) {
        this.dinheiro = dinheiro;
    }

    public Inventario getInventario() {
        return inventario;
    }

    public void setInventario(Inventario inventario) {
        this.inventario = inventario;
    }

    public Atributos getAtributos() {
        return atributos;
    }

    public void setAtributos(Atributos atributos) {
        this.atributos = atributos;
    }

    public Cenario getCenarioAtual() {
        return cenarioAtual;
    }

    public void setCenarioAtual(Cenario cenarioAtual) {
        this.cenarioAtual = cenarioAtual;
    }
}

