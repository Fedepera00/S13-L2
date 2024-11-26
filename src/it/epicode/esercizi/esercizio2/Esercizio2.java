package it.epicode.esercizi.esercizio2;


import org.slf4j.Logger; // LOGGING
import org.slf4j.LoggerFactory;
import java.util.*;

public class Esercizio2 {
    private static final Logger logger = LoggerFactory.getLogger(Esercizio2.class);

    public static void esegui() {

        Scanner scanner = new Scanner(System.in);

        logger.info("Esercizio 2 iniziato.");

        // NUMERO DI ELEMENTI DA GENERARE
        System.out.println("Inserisci il numero di elementi da generare:");
        int n = scanner.nextInt();

        // GENERA LISTA DI ELEMENTI CON NUMERI CASUALI
        List<Integer> listaNumeri = generaNumeriCasuali(n);
        System.out.println("Lista originale: " + listaNumeri);

        // INVERSO LISTA NUMERI
        List<Integer> listaEstesa = aggiungiInverso(listaNumeri);
        System.out.println("Lista con inverso aggiunto: " + listaEstesa);

        // STAMPO PARI O DISPARI
        System.out.println("Vuoi stampare i valori in posizioni pari? (true/false):");
        boolean pari = scanner.nextBoolean();

        stampaPariDispari(listaEstesa, pari);

        logger.info("Esercizio 2 completato.");
    }

    private static List<Integer> generaNumeriCasuali(int n) {
        Random random = new Random(); // NUMERI CASUALI
        List<Integer> numeri = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            numeri.add(random.nextInt(101)); // NUMERI A CASO DA 0 A 100
        }
        logger.debug("Numeri casuali generati: {}", numeri);
        return numeri;
    }

    private static List<Integer> aggiungiInverso(List<Integer> lista) {
        List<Integer> nuovaLista = new ArrayList<>(lista); // LISTA BASATA SULL ORIGINALE
        List<Integer> inverso = new ArrayList<>(lista); // COPIA ORIGINALE
        Collections.reverse(inverso); // REVERSE
        nuovaLista.addAll(inverso);
        logger.debug("Lista con inverso aggiunto: {}", nuovaLista); //DEBUG LISTA ESTESA
        return nuovaLista;
    }

    private static void stampaPariDispari(List<Integer> lista, boolean pari) {
        String tipo = pari ? "pari" : "dispari";
        System.out.println("Valori in posizioni " + tipo + ":");
        logger.info("Stampando valori in posizioni {}", tipo);
        for (int i = (pari ? 0 : 1); i < lista.size(); i += 2) {
            System.out.println(lista.get(i));
        }
    }
}