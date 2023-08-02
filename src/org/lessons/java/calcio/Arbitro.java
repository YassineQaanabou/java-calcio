package org.lessons.java.calcio;

import java.time.LocalDate;

public class Arbitro extends Persona{
    private String ruolo;

    public Arbitro(String nome, LocalDate dataNascita, String ruolo) {
        super(nome, dataNascita);
        this.ruolo = ruolo;
    }
}
