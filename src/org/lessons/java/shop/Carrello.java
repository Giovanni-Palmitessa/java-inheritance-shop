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
            int scelta = scan.nextInt();

            if(scelta == 0) {
                break;
            }

            //se utente sceglie di inserire prodotto farsi dare i dati
            System.out.println("Inserisci il nome del prodotto: ");
            String nome = scan.nextLine();
            System.out.println("Inserisci la descrizione del prodotto: ");
            String descrizione = scan.nextLine();
        }
    }
}
