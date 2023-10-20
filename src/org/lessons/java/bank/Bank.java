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



        //chiudere lo scanner
        scan.close();
    }
}
