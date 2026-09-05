package org.gabriel.classesMecanicas;

public class Item {
    private String sName;
    private String sType;
    private int iWeight;
    private double dCost;
    private int iNumberOfMaxUses;
    private boolean bIsDefault;

    public void setName(String sName) {
        this.sName = sName;
    }

    public void setType(String sType) {
        this.sType = sType;
    }

    public void setWeight(int iWeight) {
        this.iWeight = iWeight;
    }

    public void setCost(double dCost) {
        this.dCost = dCost;
    }

    public void setNumberOfMaxUses(int iNumberOfMaxUses) {
        this.iNumberOfMaxUses = iNumberOfMaxUses;
    }

    public void setIsDefault(boolean bIsDefault) {
        this.bIsDefault = bIsDefault;
    }

    public String getsName() {
        return this.sName;
    }

    public String getsType() {
        return this.sType;
    }

    public int getWeight() {
        return this.iWeight;
    }

    public int getNumberOfMaxUses() {
        return this.iNumberOfMaxUses;
    }

    public boolean getIsDefault() {
        return this.bIsDefault;
    }

    public double getCost() {
        return this.dCost;
    }
}
