package org.lessons.java.calcio;

import java.time.LocalDate;

public class Allenatore extends Persona{
    private String strategia;

    public Allenatore(String nome, LocalDate dataNascita, String strategia) {
        super(nome, dataNascita);
        this.strategia = strategia;
    }

    @Override
    public String toString() {
        return " Allenatore: "+ nome+ " Data di nascita: "+ dataNascita+" Strategia:"+ strategia ;
    }
}
