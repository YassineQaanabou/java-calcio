package org.lessons.java.calcio;

import java.time.LocalDate;

public class Giocatore extends Persona{
    private String ruolo;

    public Giocatore(String nome, LocalDate dataNascita, String ruolo) {
        super(nome, dataNascita);
        this.ruolo = ruolo;
    }

    @Override
    public String toString() {
        return " Giocatore: "+ nome+ " Data di nascita: "+ dataNascita+" Ruolo:"+ ruolo ;
    }
}
