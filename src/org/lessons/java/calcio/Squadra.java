package org.lessons.java.calcio;

import java.util.ArrayList;

public class Squadra {
    protected ArrayList<Giocatore> giocatori;
    protected Allenatore allenatore;

    public Squadra(ArrayList<Giocatore> giocatori, Allenatore allenatore) {
        this.giocatori = giocatori;
        this.allenatore = allenatore;
    }

    @Override
    public String toString() {
        return  allenatore+" Squadra: "+giocatori;
    }
}
