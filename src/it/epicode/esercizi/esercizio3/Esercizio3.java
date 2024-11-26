package it.epicode.esercizi.esercizio3;


import org.slf4j.Logger; // LOGGING
import org.slf4j.LoggerFactory;
import java.util.*;

public class Esercizio3 {
    private static final Logger logger = LoggerFactory.getLogger(Esercizio3.class);
    private static Map<String, String> rubrica = new HashMap<>(); // MAPPA PER MEMORIZZARE LA RUBRICA

    public static void esegui() {
        logger.info("Esercizio 3 iniziato.");
        Scanner scanner = new Scanner(System.in);
        boolean continua = true; // CICLO DEL MENU

        while (continua) {
            // MENU'
            System.out.println("\nSeleziona un'opzione:");
            System.out.println("1 - Aggiungi contatto");
            System.out.println("2 - Elimina contatto");
            System.out.println("3 - Cerca numero di telefono");
            System.out.println("4 - Stampa rubrica");
            System.out.println("5 - Esci");

            int scelta = scanner.nextInt();
            scanner.nextLine();

            // SWITCH TRA LE OPERAZIONI DI VARIE CASISTICHE
            switch (scelta) {
                case 1:
                    System.out.println("Inserisci il nome:");
                    String nome = scanner.nextLine();
                    System.out.println("Inserisci il numero:");
                    String numero = scanner.nextLine();
                    aggiungiContatto(nome, numero);
                    break;
                case 2:
                    System.out.println("Inserisci il nome da eliminare:");
                    String nomeElimina = scanner.nextLine();
                    eliminaContatto(nomeElimina);
                    break;
                case 3:
                    System.out.println("Inserisci il nome da cercare:");
                    String nomeCerca = scanner.nextLine();
                    System.out.println("Numero: " + cercaNumero(nomeCerca));
                    break;
                case 4:
                    stampaContatti();
                    break;
                case 5:
                    continua = false;
                    logger.info("Uscita dal programma Esercizio 3.");
                    break;
                default:
                    System.out.println("Scelta non valida. Riprova.");
            }


        }
    }

    private static void aggiungiContatto(String nome, String telefono) {
        rubrica.put(nome, telefono); // AGGIUNGO CONTATTO ALLA MAPPA
        logger.debug("Aggiunto contatto: {} - {}", nome, telefono); // DEBUG
    }

    private static void eliminaContatto(String nome) {
        rubrica.remove(nome); // RIMUOVO
        logger.debug("Eliminato contatto: {}", nome);
    }

    private static String cercaNumero(String nome) {
        String numero = rubrica.getOrDefault(nome, "Non trovato");
        logger.debug("Numero trovato per {}: {}", nome, numero);
        return numero;
    }

    private static void stampaContatti() {
        System.out.println("Rubrica:");
        rubrica.forEach((nome, telefono) -> System.out.println(nome + " - " + telefono));
        logger.debug("Rubrica stampata: {}", rubrica);
    }
}