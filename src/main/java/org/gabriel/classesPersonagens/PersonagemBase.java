package org.gabriel.classesPersonagens;

import org.gabriel.classesMecanicas.Inventario;

public class PersonagemBase {
    private int     iLife;
    private int     iDefense;
    private int     iDamage;
    private int     iMagicDefense;
    private int     iManna;
    private String  sBuffName;
    private double  dBuffPercentage;
    private double  dMoney;
    private Inventario oInventario;

    public void setLife(int life) {
        this.iLife = life;
    }

    public void setDefense(int defense) {
        this.iDefense = defense;
    }

    public void setDamage(int damage) {
        this.iDamage = damage;
    }

    public void setMagicDefense(int magicDefense) {
        this.iMagicDefense = magicDefense;
    }

    public void setManna(int manna) {
        this.iManna = manna;
    }

    public void setBuffName(String buffName) {
        this.sBuffName = buffName;
    }

    public void setBuffPercentage(double dBuffPercentage) {
        this.dBuffPercentage = dBuffPercentage;
    }

    public void setMoney(double dMoney) {
        this.dMoney = dMoney;
    }

    public void setInventorySlots(int inventorySlot) {
        this.oInventario = new Inventario(1000);
    }

    public int getLife() {
        return this.iLife;
    }

    public int getDefense() {
        return this.iDefense;
    }

    public int getDamage() {
        return this.iDamage;
    }

    public int getMagicDefense() {
        return this.iMagicDefense;
    }

    public int getManna() {
        return this.iManna;
    }

    public String getBuffName() {
        return this.sBuffName;
    }

    public double getBuffPercentage() {
        return this.dBuffPercentage;
    }

    public double getMoney() {
        return this.dMoney;
    }

    public int getInventorySlots() {
        return this.oInventario.getInventorySlots();
    }

//    protected int attack(){
//
//    }
//
//    protected int spendManna(){
//
//    }
//
//    protected double useBuff(){
//
//    }
//
//    protected int reduceInventorySlots(){
//
//    }
//
//    protected int increaseInventorySlots(){
//
//    }
}

