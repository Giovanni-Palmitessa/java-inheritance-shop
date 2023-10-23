package org.lessons.java.shop;

public class Tv extends Prodotto{
    //ATTRIBUTI
    private int dimension;
    private boolean isSmartTv;

    //COSTRUTTORE
    public Tv(String nome, String descrizione, double prezzo, int iva, int dimension, boolean isSmartTv) {
        super(nome, descrizione, prezzo, iva);

        this.dimension = dimension;
        this.isSmartTv = isSmartTv;
    }

    //GETTER E SETTER
    public int getDimension() {
        return dimension;
    }
    public void setDimension(int dimension) {
        this.dimension = dimension;
    }
    public boolean isSmartTv() {
        return isSmartTv;
    }
    public void setSmartTv(boolean smartTv) {
        isSmartTv = smartTv;
    }
}
