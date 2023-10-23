package org.lessons.java.shop;

public class Cuffia extends Prodotto{
    // ATTRIBUTI
    private  String color;
    private boolean isWired;

    // COSTRUTTORE
    public Cuffia(String nome, String descrizione, double prezzo, int iva, String color, boolean isWired) {
        super(nome, descrizione, prezzo, iva);

        this.color = color;
        this.isWired = isWired;
    }

    // GETTER E SETTER
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public boolean getIsWired() {
        return isWired;
    }
    public void setWired(boolean wired) {
        isWired = wired;
    }

    //METODI
    @Override
    public String toString() {
        return "Nome: " + getNome() + ", Descrizione: " + getDescrizione() + ", Prezzo: " + getPrice() + "€, IVA: " + getIva() + "%" + ", Colore " + getColor() + ", Cuffie cablate? " + getIsWired();
    }
}
