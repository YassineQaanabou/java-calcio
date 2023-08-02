package org.lessons.java.calcio;

import java.util.ArrayList;

public class Squadra {
    private ArrayList<Giocatore> giocatori = new ArrayList<>();
    private Allenatore allenatore;

    public Squadra(ArrayList<Giocatore> giocatori, Allenatore allenatore) {
        this.giocatori = giocatori;
        this.allenatore = allenatore;
    }

    public void aggiungiGiocatore(Giocatore giocatore){
        giocatori.add(giocatore);
    }

    @Override
    public String toString() {
        return "Squadra: " +allenatore+giocatori;
    }
}
