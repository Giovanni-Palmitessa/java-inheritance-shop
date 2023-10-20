package org.lessons.java.bank;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        //inizializzare lo scanner
        Scanner scan = new Scanner(System.in);

        //chiedere all'utente il nome
        System.out.println("Dammi il tuo Nome e Cognome, sarai l'intestatario del Conto");
        String nomeCliente = scan.nextLine();
        Conto conto = new Conto(nomeCliente);
        System.out.println("Ciao " + conto.getNomeCliente() + ". Il tuo numero di conto è: "+ conto.getNumeroConto() + ". " + conto.getFormattedCount());

        boolean uscita = false;

        while (!uscita) {
            // Mostra il menu delle opzioni
            System.out.println("\nScegli un'opzione:");
            System.out.println("1. Versare denaro");
            System.out.println("2. Prelevare denaro");
            System.out.println("3. Uscire");
            int scelta = scan.nextInt();

            switch (scelta) {
                case 1:
                    System.out.println("Inserisci l'importo da versare: ");
                    double importoVersato = scan.nextDouble();
                    conto.deposita(importoVersato);
                    System.out.println("Operazione di versamento completata. Saldo attuale: " + conto.getFormattedCount());
                    break;

                case 2:
                    System.out.println("Inserisci l'importo da prelevare: ");
                    double importoPrelevato = scan.nextDouble();
                    double nuovoSaldo = conto.preleva(importoPrelevato);
                    if (nuovoSaldo <= 0) {
                        System.out.println("Operazione di prelievo non valida. Saldo insufficiente." + conto.getFormattedCount());
                    } else {
                        System.out.println("Operazione di prelievo completata. Saldo attuale: " + conto.getFormattedCount());
                    }
                    break;

                case 3:
                    uscita = true;
                    System.out.println("Grazie per aver utilizzato il nostro servizio.");
                    break;

                default:
                    System.out.println("Scelta non valida. Riprova.");
                    break;
            }
        }



        //chiudere lo scanner
        scan.close();
    }
}
