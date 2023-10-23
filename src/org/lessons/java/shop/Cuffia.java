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
    public boolean isWired() {
        return isWired;
    }
    public void setWired(boolean wired) {
        isWired = wired;
    }
}
