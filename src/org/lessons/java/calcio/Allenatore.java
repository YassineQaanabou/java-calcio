package org.lessons.java.calcio;

public class Allenatore extends Persona{
    private String strategia;

    public Allenatore(String nome, int eta, String strategia) {
        super(nome, eta);
        this.strategia = strategia;
    }
    @Override
    public String toString() {
        return "Allenatore: "+ nome+ " Età: "+ eta+" Strategia:"+ strategia ;
    }
}
