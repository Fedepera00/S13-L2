package it.epicode.esercizi.esercizio1;


import org.slf4j.Logger; // LOGGING
import org.slf4j.LoggerFactory;

import java.util.*; // SET,LISTEN E SCANNER

public class Esercizio1 {
    private static final Logger logger = LoggerFactory.getLogger(Esercizio1.class);

    public static void esegui() {
        logger.info(" Esercizio 1 iniziatO.");

        Scanner scanner = new Scanner(System.in);

        // INSERIRE UN NUMERO DI PAROLE N ALL UTENTE
        System.out.println("Inserisci il numero di parole che desideri: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        // STRUTTURA SET PER MEMORIZZARE PAROLE UNICHE
        Set<String> paroleDistinte = new HashSet<>();

        // LIST PER MEMORIZZARE TUTTE LE PAROLE
        List<String> tutteLeParole = new ArrayList<>();
        System.out.println("Inserisci le parole:");

        // CICLO PER RACCOGLIERE N PAROLE DALL UTENTE
        for (int i = 0; i < n; i++) {
            String parola = scanner.nextLine();
            tutteLeParole.add(parola);
            paroleDistinte.add(parola);
        }

        // DATI INSERITI PER DEBUG
        logger.debug("Parole inserite: {}", tutteLeParole);

        // NUMERO PAROLE DISTINTE
        logger.info("Numero di parole distinte: {}", paroleDistinte.size());


        System.out.println("Parole duplicate:");
        tutteLeParole.stream()
                .filter(parola -> Collections.frequency(tutteLeParole, parola) > 1) // PAROLE DOPPIE
                .distinct() // CANCELLO I DUPLICATI
                .forEach(System.out::println);

        // STAMPA NUMERO PAROLE ELENCO DISTINTE
        System.out.println("Numero di parole distinte: " + paroleDistinte.size());
        System.out.println("Elenco delle parole distinte: " + paroleDistinte);

        logger.info(" Esercizio 1 completato.");
    }
}