package org.gabriel.classesMecanicas;

public class Atributos {
    private int forcaFisica;
    private int resistenciaFisica;
    private int mentalidade;
    private int agilidade;
    private int carisma;
    private int sorte;

    public Atributos atributosInit(String classe) {
        switch (classe) {
            case "Guerreiro":
                this.forcaFisica = 10;
                this.resistenciaFisica = 8;
                this.mentalidade = 5;
                this.agilidade = 4 ;
                this.carisma = 6;
                this.sorte = 7;
                break;

            case "Feiticeiro":
                this.forcaFisica = 4;
                this.resistenciaFisica = 6 ;
                this.mentalidade = 10 ;
                this.agilidade = 8;
                this.carisma = 5;
                this.sorte = 7 ;
                break;

            case "Bandido":
                this.forcaFisica = 8;
                this.resistenciaFisica = 6 ;
                this.mentalidade = 6;
                this.agilidade = 7;
                this.carisma = 10 ;
                this.sorte = 8;
                break;

            case "Arqueiro":
                this.forcaFisica = 6;
                this.resistenciaFisica = 7 ;
                this.mentalidade = 7 ;
                this.agilidade = 10 ;
                this.carisma = 8;
                this.sorte = 9;
                break;

            default:
                return null;
        }
        return this;
    }
}
