package org.gabriel.classesPersonagens;

import org.gabriel.classesMecanicas.Atributos;

public class Bandido extends PersonagemBase {
    private final String role;

    public Bandido() {
        super();
        this.role = "Bandido";
        this.atributos = new Atributos(role);
    }
}
