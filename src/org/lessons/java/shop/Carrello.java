package org.lessons.java.shop;

import java.util.Scanner;

public class Carrello {
    public static void main(String[] args) {
        //array di prodotti
        Prodotto[] carrello = new Prodotto[100];

        //istanzio lo scanner
        Scanner scan = new Scanner(System.in);

        // indice per prodotti
        int indice = 0;

        //totale
        double totale = 0.00;

        //Ciclo while per inserire un prodotto
        while (true) {
            System.out.println("Inserisci il tipo di prodotto (1 = Smartphone, 2 = TV, 3 = Cuffie, 0 = Esci): ");

            //definisco la scelta
            int scelta = Integer.parseInt(scan.nextLine());

            if(scelta == 0) {
                break;
            }

            //se utente sceglie di inserire prodotto farsi dare i dati
            System.out.println("Inserisci il nome del prodotto: ");
            String nome = scan.nextLine();
            System.out.println("Inserisci la descrizione del prodotto: ");
            String descrizione = scan.nextLine();
            System.out.println("Inserisci il prezzo del prodotto: ");
            double prezzo = Double.parseDouble(scan.nextLine());
            System.out.println("Inserisci l'IVA del prodotto: ");
            int iva = Integer.parseInt(scan.nextLine());

            Prodotto prodotto = null;
            //scelta prodotto smartphone
            if(scelta == 1) {
                System.out.println("Inserisci il codice IMEI del prodotto: ");
                int imeiCode = Integer.parseInt(scan.nextLine());
                System.out.println("Inserisci la capacità della memoria (GigaByte): ");
                int storage = Integer.parseInt(scan.nextLine());

                //istanzio il nuovo prodotto
                prodotto = new Smartphone(nome, descrizione, prezzo, iva, imeiCode, storage);
            //scelta prodotto TV
            } else if (scelta == 2) {
                System.out.println("Inserisci i pollici del Televisore: ");
                int dimension = Integer.parseInt(scan.nextLine());
                System.out.println("La TV è di tipo SmartTv? (scrivi: true/false)");
                boolean isSmartTv = Boolean.parseBoolean(scan.nextLine());

                //istanzio il nuovo prodotto
                prodotto = new Tv(nome, descrizione, prezzo, iva, dimension, isSmartTv);
            } else if (scelta == 3) {
                System.out.println("Inserisci il colore delle cuffie: ");
                String color = scan.nextLine();
                System.out.println("Le cuffie sono di tipo cablato? (scrivi: true/false)");
                boolean isWired = Boolean.parseBoolean(scan.nextLine());

                //istanzio il nuovo prodotto
                prodotto = new Cuffia(nome, descrizione, prezzo, iva, color, isWired);
            } else {
                System.out.println("Inserisci una scelta valida!!");
                continue;
            }

            // Aggiungi il prodotto all'array
            carrello[indice] = prodotto;
            indice++;
        }

        //stampare resoconto carrello
        System.out.println("Carrello:");
        for (int i = 0; i < indice; i++) {
            System.out.println(carrello[i]);
        }

        System.out.println("Totale: " + totale);
    }
}
