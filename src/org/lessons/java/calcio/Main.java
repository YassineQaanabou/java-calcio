package org.lessons.java.calcio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random randomGenerator =new Random();
        LocalDate now = LocalDate.now();
        String[] nomi={"ronaldo", "messi", "hakimi", "alisson", "gvardiol", "modric","de bruyne", "camavinga",
                "leao", "tomori","theo", "Didi", "Artur Friedenreich", "Garrincha", "Kaká", "Leônidas",
                "Marta", "Mauro", "Neymar", "Pelé", "Rivaldo", "Romário", "Ronaldo", "Sócrates", "Vavá"};

        String[] ruoli={"portiere", "difensore", "difensore","terzino", "terzino", "centrocampista","centrocampista","centrocampista","ala","ala","attaccante"};

        String[] strategie={"contropiede", "palla lunga", "possesso palla","lungo le fascie", "catenaccio","brexit"};
        String[] ruoliArbitro={"Arbitro", "guardalinee", "guardalinee"};

        ArrayList<Giocatore> giocatoriCasa = new ArrayList<>();
        ArrayList<Giocatore> giocatoriOspite = new ArrayList<>();

/*SQUADRA CASA*/
        while (giocatoriCasa.size()<11){
            int a = randomGenerator.nextInt(0,24);
            int daysBack=randomGenerator.nextInt(6570,12775);
            int b= randomGenerator.nextInt(0, 10);
            LocalDate dataNascita =now.minusDays(daysBack);

            Giocatore giocatore= new Giocatore(nomi[a],dataNascita,ruoli[b]);

            giocatoriCasa.add(giocatore);
        }

        int strategiaCasa = randomGenerator.nextInt(0,5);
        int nomeAllenatoreCasa = randomGenerator.nextInt(0,24);
        int daysBackCoachHome=randomGenerator.nextInt(14600,25550);

        LocalDate dataNascitaAllenatore =now.minusDays(daysBackCoachHome);

        Allenatore allenatoreCasa =new Allenatore(nomi[nomeAllenatoreCasa],dataNascitaAllenatore, strategie[strategiaCasa]);

        Squadra squadraCasa=new Squadra(giocatoriCasa,allenatoreCasa);

        System.out.println(squadraCasa);

/*SQUADRA OSPITE*/
        while (giocatoriOspite.size()<11){
            int a = randomGenerator.nextInt(0,24);
            int daysBack=randomGenerator.nextInt(6570,12775);
            int b= randomGenerator.nextInt(0, 10);
            LocalDate dataNascita =now.minusDays(daysBack);

            Giocatore giocatore= new Giocatore(nomi[a],dataNascita,ruoli[b]);

            giocatoriOspite.add(giocatore);
        }

        int strategiaOspite = randomGenerator.nextInt(0,5);
        int nomeAllenatoreOspite = randomGenerator.nextInt(0,24);
        int daysBackCoachAway=randomGenerator.nextInt(14600,25550);

        LocalDate dataNascitaAllenatoreOspite =now.minusDays(daysBackCoachAway);

        Allenatore allenatoreOspite =new Allenatore(nomi[nomeAllenatoreOspite],dataNascitaAllenatoreOspite, strategie[strategiaOspite]);

        Squadra squadraOspite=new Squadra(giocatoriOspite,allenatoreOspite);

        System.out.println(squadraOspite);

  /*ARBITRO*/
        int nomeArbitro = randomGenerator.nextInt(0,25);

        int daysBackReferee=randomGenerator.nextInt(14600,25550);

        LocalDate dataNascitaArbitro =now.minusDays(daysBackReferee);


        Arbitro arbitro= new Arbitro(nomi[nomeArbitro],dataNascitaArbitro,ruoliArbitro[0]);

        /*PARTITA*/

        Partita partita =new Partita(squadraCasa,squadraOspite,arbitro);

        System.out.println(partita.golSegnato());

        partita.iniziaPartita();

        System.out.println(partita.golSegnato());
        System.out.println(partita.golSegnato());
        System.out.println(partita.golSegnato());
        System.out.println(partita.golSegnato());
        System.out.println(partita.golSegnato());



        System.out.println("Casa: "+partita.getGolCasa());
        System.out.println("Ospite: "+partita.getGolOspite());

        System.out.println("Marcatori Casa: "+partita.getMarcatoriCasa());
        System.out.println("Marcatori Ospite: "+partita.getMarcatoriOspite());





    }
}

