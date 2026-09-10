package org.gabriel.classesPersonagens;

import org.gabriel.classesMecanicas.Atributos;

public class Arqueiro extends PersonagemBase {
    private final String role;

    public Arqueiro() {
        super();
        this.role = "Arqueiro";
        this.atributos = new Atributos(role);
    }
}
