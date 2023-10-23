package org.lessons.java.shop;

public class Smartphone extends Prodotto{
    // ATTRIBUTI
    private int imeiCode;

    //COSTRUTTORE
    public Smartphone(String nome, String descrizione, double prezzo, int iva) {
        super(nome, descrizione, prezzo, iva);

        this.imeiCode = imeiCode;
    }

    //GETTER E SETTER
    public int getImeiCode() {
        return imeiCode;
    }

    public void setImeiCode(int imeiCode) {
        this.imeiCode = imeiCode;
    }
}
