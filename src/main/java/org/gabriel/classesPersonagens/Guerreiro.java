package org.gabriel.classesPersonagens;

import org.gabriel.classesMecanicas.Atributos;

public class Guerreiro extends PersonagemBase {
    private final String role = "Guerreiro";

    public Guerreiro() {
        super();
        this.atributos = new Atributos(role);
        // new se encarrega de retornar ao objeto recém-criado os valores guardados com 'this.' na subclasse
    }

}
