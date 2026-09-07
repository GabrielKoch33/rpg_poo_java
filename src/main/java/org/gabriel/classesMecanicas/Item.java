package org.gabriel.classesMecanicas;

public class Item {
    private String nome;
    private String descricao;
    private String tipo;
    private int peso;
    private double preco;
    private int numeroDeUsos = 9999;
    private boolean isDefault = false;

    /**Caso queiramos definir um número máximo de usos e que o item seja permanente do personagem utilizamos esse construtor*/
    public Item(String nome, String descricao, String tipo, int peso, double preco, int numeroDeUsos, boolean isDefault ){
        this(nome, descricao ,tipo, peso, preco);
        this.numeroDeUsos = numeroDeUsos;
        this.isDefault = isDefault;

    }
    /**Caso o número de usos seja 'infinito' ou os itens não são 'defaults', utilizamos esse*/
    public Item(String nome, String descricao,String tipo, int peso, double preco){
        this.nome = nome;
        this.descricao = descricao;
        this.tipo = tipo;
        this.peso = peso;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getNumeroDeUsos() {
        return numeroDeUsos;
    }

    public void setNumeroDeUsos(int numeroDeUsos) {
        this.numeroDeUsos = numeroDeUsos;
    }

    public boolean isDefault() {
        return isDefault;
    }

    public void setDefault(boolean aDefault) {
        isDefault = aDefault;
    }
}
