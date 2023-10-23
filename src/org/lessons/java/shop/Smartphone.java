package org.lessons.java.shop;

public class Smartphone extends Prodotto{
    // ATTRIBUTI
    private int imeiCode;

    private int storage;

    //COSTRUTTORE
    public Smartphone(String nome, String descrizione, double prezzo, int iva, int imeiCode, int storage) {
        super(nome, descrizione, prezzo, iva);

        this.imeiCode = imeiCode;
        this.storage = storage;
    }

    //GETTER E SETTER
    public int getImeiCode() {
        return imeiCode;
    }
    public int getStorage() {
        return storage;
    }
    public void setImeiCode(int imeiCode) {
        this.imeiCode = imeiCode;
    }
    public void setStorage(int storage) {
        this.storage = storage;
    }

    //METODI
    @Override
    public String toString() {
        return "Nome: " + getNome() + ", Descrizione: " + getDescrizione() + ", Prezzo: " + getPrice() + "€, IVA: " + getIva() + "%" + ", IMEI Code: " + getImeiCode() + ", Memoria: " + getStorage();
    }

}
