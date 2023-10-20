package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
    //ATTRIBUTI
    private int codice;
    private String nome;
    private String descrizione;
    private double prezzo;
    private int iva;

    //COSTRUTTORI
    /*public Prodotto() {
        codice = 0;
        nome = "";
        descrizione = "";
        prezzo = 0.00;
        iva = 0;
    }*/

    public Prodotto(String nome, String descrizione, double prezzo, int iva) {
        Random random = new Random();
        codice = random.nextInt(1000);
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    // METODI

    //GETTER
    public int getCodice() {
        return codice;
    }

    public String getNome(){
        return nome;
    }

    public String getDescrizione(){
        return descrizione;
    }
    public double getPrice() {
        return prezzo;
    }

    public int getIva(){
        return iva;
    }


    public double getPriceIva() {
        double priceIva = prezzo + (1 + iva / 100.00);
        return  priceIva;
    }

    public String getCompleteName(){
        String completeName = codice + nome;
        return completeName;
    }

}
