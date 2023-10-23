package org.lessons.java.shop;

public class Cuffia extends Prodotto{
    // ATTRIBUTI
    private  String color;
    private boolean isWired;

    // COSTRUTTORE
    public Cuffia(String nome, String descrizione, double prezzo, int iva) {
        super(nome, descrizione, prezzo, iva);
    }
}
