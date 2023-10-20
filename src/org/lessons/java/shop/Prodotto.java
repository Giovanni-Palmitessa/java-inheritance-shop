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

    public Prodotto(int codice, String nome, String descrizione, double prezzo, int iva) {
        this.codice = codice;
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    // METODI

    public double getPrice() {
        return prezzo;
    }

    public double getPriceIva() {
        double priceIva = prezzo + (1 + iva / 100.00);
        return  priceIva;
    }


}
