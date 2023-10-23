package org.lessons.java.shop;

import java.util.Scanner;

public class Carrello {
    public static void main(String[] args) {
        //istanzio lo scanner
        Scanner scan = new Scanner(System.in);

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
            }
        }
    }
}
