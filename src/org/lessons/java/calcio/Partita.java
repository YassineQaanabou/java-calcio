package org.lessons.java.calcio;

import java.util.ArrayList;
import java.util.Random;

public class Partita {
    Random randomGenerator =new Random();

    protected Squadra squadraCasa;
    protected Squadra squadraOspite;
    protected Arbitro arbitro;
    protected boolean partitaIniziata=false;
    protected int golCasa=0;
    protected int golOspite=0;
    protected ArrayList<Giocatore> marcatoriCasa= new ArrayList<>();
    protected ArrayList<Giocatore> marcatoriOspite= new ArrayList<>();


    public Partita(Squadra squadraCasa, Squadra squadraOspite,Arbitro arbitro) {
        this.squadraCasa = squadraCasa;
        this.squadraOspite = squadraOspite;
        this.arbitro = arbitro;
    }

    public int getGolCasa() {
        return golCasa;
    }

    public int getGolOspite() {
        return golOspite;
    }

    public ArrayList<Giocatore> getMarcatoriCasa() {
        return marcatoriCasa;
    }

    public ArrayList<Giocatore> getMarcatoriOspite() {
        return marcatoriOspite;
    }

    public void iniziaPartita() {
        this.partitaIniziata=true;

    }

    public String golSegnato(){
        int a = randomGenerator.nextInt(1,3);
        String golSegnato=null;

        if(partitaIniziata) {
            if (a == 1) {
                int marcatore = randomGenerator.nextInt(0,10);
                golSegnato = "Ha segnato la squadra di casa";
                marcatoriCasa.add(squadraCasa.giocatori.get(marcatore));
                golCasa++;

            } else if (a==2){
                int marcatore = randomGenerator.nextInt(0,10);
                marcatoriOspite.add(squadraOspite.giocatori.get(marcatore));

                golSegnato = "Ha segnato la squadra ospite";
                golOspite++;

            }
        }else if(!partitaIniziata){
            golSegnato = "La partita non è ancora iniziata";

        }
        return golSegnato;
    }
}
