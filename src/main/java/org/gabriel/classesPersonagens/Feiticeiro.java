package org.gabriel.classesPersonagens;

import org.gabriel.classesMecanicas.Atributos;

public class Feiticeiro extends PersonagemBase {
    private final String role;

    public Feiticeiro() {
        super();
        this.role = "Feiticeiro";
        this.atributos = new Atributos(role);
    }
}
