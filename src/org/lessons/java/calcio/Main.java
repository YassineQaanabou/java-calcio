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

        String[] ruoli={"attaccante", "difensore", "terzino","centrocampista", "ala", "portiere"};

        String[] strategie={"contropiede", "palla lunga", "possesso palla","lungo le fascie", "catenaccio","brexit"};

        ArrayList<Giocatore> giocatori = new ArrayList<>();

        while (giocatori.size()<11){
            int a = randomGenerator.nextInt(1,25);
            int b = randomGenerator.nextInt(1,6);
            int monthsBack=randomGenerator.nextInt(216,420);

            LocalDate dataNascita =now.minusMonths(monthsBack);

            Giocatore giocatore= new Giocatore(nomi[a],dataNascita,ruoli[b]);

            giocatori.add(giocatore);
        }

        int c = randomGenerator.nextInt(1,6);
        int d = randomGenerator.nextInt(1,25);
        int monthsBackCoach=randomGenerator.nextInt(480,840);

        LocalDate dataNascitaAllenatore =now.minusMonths(monthsBackCoach);

        Allenatore allenatore =new Allenatore(nomi[d],dataNascitaAllenatore, strategie[c]);

        Squadra squadra=new Squadra(giocatori,allenatore);

        System.out.println(squadra);


    }
}
