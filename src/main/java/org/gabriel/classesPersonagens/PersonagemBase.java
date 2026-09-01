package org.gabriel.classesPersonagens;

abstract class PersonagemBase {
    private int vida;
    private int resistencia;
    private int resistenciaMagia;
    private int mana;
    private String buffNome;
    private double buffPorcentagem;
    private int espacosInventario;

    protected abstract int ataque();


}
