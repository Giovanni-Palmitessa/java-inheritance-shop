package org.lessons.java.shop;

public class Main {
    public static void main(String[] args) {
        Prodotto prodotto1 = new Prodotto("Prodotto 1", "Descrizione 1", 10.0, 22);
        System.out.println(prodotto1.getCodice());
    }
}
