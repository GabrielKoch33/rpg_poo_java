package org.gabriel.classesMecanicas;

public class Item {
    private String name;
    private String type;
    private int weight;
    private double cost;
    private int numberOfMaxUses = 10000;
    private boolean isDefault;

    /**Caso queiramos definir um número máximo de usos utilizamos esse construtor*/
    public Item(String name, String type, int weight, double cost, boolean isDefault,int numberOfMaxUses){
        this(name, type, weight, cost, isDefault);
        this.numberOfMaxUses = numberOfMaxUses;
    }
    /**Caso o número de usos seja infinito, utilizamos esse*/
    public Item(String name, String type, int weight, double cost, boolean isDefault){
        this.name = name;
        this.type = type;
        this.weight = weight;
        this.cost = cost;
        this.isDefault = isDefault;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getNumberOfMaxUses() {
        return numberOfMaxUses;
    }

    public void setNumberOfMaxUses(int numberOfMaxUses) {
        this.numberOfMaxUses = numberOfMaxUses;
    }

    public boolean getIsDefault() {
        return isDefault;
    }

    public void setDefault(boolean isDefault) {
        this.isDefault = isDefault;
    }
}
