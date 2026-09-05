package org.gabriel.classesMonstros;

public class MonstroBase {
    private int     iLife;
    private int     iDefense;
    private int     iDamage;
    private int     iMagicDefense;
    private int     iManna;
    private String  sDebuffName;
    private double  dDebuffPercentage;
    private boolean bIsBoss;

    public void setLife(int life){
        this.iLife = life;
    }
    public void setDefense(int defense){
        this.iDefense = defense;
    }
    public void setDamage(int damage){
        this.iDamage = damage;
    }
    public void setMagicDefense(int magicDefense){
        this.iMagicDefense = magicDefense;
    }

    public void setManna(int manna){
        this.iManna = manna;
    }

    public void setDebuffName(String debuffName){
        this.sDebuffName = debuffName;
    }

    public void setDebuffPercentage(double debuffPercentage){
        this.dDebuffPercentage = debuffPercentage;
    }

    public void setBoss(boolean statusBoss){
        this.bIsBoss = statusBoss;
    }

    public int getLife(){
        return this.iLife;
    }

    public int getDefense(){
        return this.iDefense;
    }
    public int getDamage(){
        return this.iDamage;
    }

    public int getMagicDefense(){
        return this.iMagicDefense;
    }

    public int getManna(){
        return this.iManna;
    }

    public String getDebuffName(){
        return this.sDebuffName;
    }

    public double getDebuffPercentage(){
        return this.dDebuffPercentage;
    }

    public boolean getBoss(){
        return this.bIsBoss;
    }
}
