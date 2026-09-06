package org.gabriel.classesPersonagens;

import org.gabriel.classesMecanicas.Inventario;

public class PersonagemBase {
    private int     life;
    private int     defense;
    private int     damage;
    private int     magicDefense;
    private int     manna;
    private String  buffName;
    private double  buffPercentage;
    private double  money;
    private Inventario inventory;



    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getMagicDefense() {
        return magicDefense;
    }

    public void setMagicDefense(int magicDefense) {
        this.magicDefense = magicDefense;
    }

    public int getManna() {
        return manna;
    }

    public void setManna(int manna) {
        this.manna = manna;
    }

    public String getBuffName() {
        return buffName;
    }

    public void setBuffName(String buffName) {
        this.buffName = buffName;
    }

    public double getBuffPercentage() {
        return buffPercentage;
    }

    public void setBuffPercentage(double buffPercentage) {
        this.buffPercentage = buffPercentage;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public Inventario getInventory() {
        return inventory;
    }

    public void setInventory(Inventario inventory) {
        this.inventory = new Inventario(30);
    }
}

