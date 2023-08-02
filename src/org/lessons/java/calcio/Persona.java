package org.lessons.java.calcio;

import java.time.LocalDate;
public class Persona {
    protected String nome;

    protected LocalDate dataNascita;

    public Persona(String nome, LocalDate dataNascita) {
        this.nome = nome;
        this.dataNascita=dataNascita;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
