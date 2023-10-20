package org.lessons.java.shop;

public class Prodotto {
    //ATTRIBUTI
    private int codice;
    private String nome;
    private String descrizione;
    private double prezzo;
    private int iva;

    //COSTRUTTORI
    public Prodotto() {
        codice = 0;
        nome = "";
        descrizione = "";
        prezzo = 0.00;
        iva = 0;
    }

}
