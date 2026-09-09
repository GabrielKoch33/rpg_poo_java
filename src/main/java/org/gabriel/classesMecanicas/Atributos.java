package org.gabriel.classesMecanicas;

public class Atributos {
    private int vitalidade;
    private int dano;
    private int agilidade;
    private int resistenciaFisica;
    private int resistenciaMentalMagica;
    private int mana;
    private int carisma;
    private int sorte;

    /** ATRIBUTO  | ESCALA: <br>
     * vitalidade: 0 à 100 <br>
     * dano:       0 à 100 <br>
     * agilidade:  0 à 100 <br>
     * resistencia física: 0 à 100 <br>
     * resistencia mágica: 0 à 100 <br>
     * mana:       0 à 100 <br>
     * carisma:    0 à 10 <br>
     * sorte:      0 à 10
     * */
    public Atributos(String role) {
        switch (role) {
            case "Guerreiro":
                this.vitalidade = 50;
                this.dano = 30;
                this.agilidade = 18;
                this.resistenciaFisica = 35;
                this.resistenciaMentalMagica = 10;
                this.mana = 0;
                this.carisma = 25;
                this.sorte = 2;
                break;

            case "Feiticeiro":
                this.vitalidade = 50;
                this.dano = 30;
                this.agilidade = 18;
                this.resistenciaFisica = 35;
                this.resistenciaMentalMagica = 10;
                this.mana = 0;
                this.carisma = 25;
                this.sorte = 2;
                break;

            case "Bandido":
                this.vitalidade = 50;
                this.dano = 30;
                this.agilidade = 18;
                this.resistenciaFisica = 35;
                this.resistenciaMentalMagica = 10;
                this.mana = 0;
                this.carisma = 25;
                this.sorte = 2;
                break;

            case "Arqueiro":
                this.vitalidade = 50;
                this.dano = 30;
                this.agilidade = 18;
                this.resistenciaFisica = 35;
                this.resistenciaMentalMagica = 10;
                this.mana = 0;
                this.carisma = 25;
                this.sorte = 2;
                break;

            default:
                break;
        }
        return;
    }
}
