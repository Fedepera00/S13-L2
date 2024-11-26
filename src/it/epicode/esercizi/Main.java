package it.epicode.esercizi;

import it.epicode.esercizi.esercizio1.Esercizio1;
import it.epicode.esercizi.esercizio2.Esercizio2;
import it.epicode.esercizi.esercizio3.Esercizio3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        logger.info("Avvio del programma principale.");

        System.out.println("Esercizio 1:");
        Esercizio1.esegui();

        System.out.println("\nEsercizio 2:");
        Esercizio2.esegui();

        System.out.println("\nEsercizio 3:");
        Esercizio3.esegui();

        logger.info("Programma principale completato.");
    }
}