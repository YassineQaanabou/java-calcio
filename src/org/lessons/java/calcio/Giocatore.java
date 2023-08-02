package org.lessons.java.calcio;

public class Giocatore extends Persona{
    private String ruolo;

    public Giocatore(String nome, int eta, String ruolo) {
        super(nome, eta);
        this.ruolo = ruolo;
    }

    @Override
    public String toString() {
        return "Giocatore: "+ nome+ " Età: "+ eta+" Ruolo:"+ ruolo ;
    }
}
