package org.lessons.java.bank;

import java.util.Random;

public class Conto {
    // ARGOMENTI
    private int numeroConto;
    private String nomeCliente;
    private double saldo;

    //COSTRUTTORI
    public Conto(String nomeCliente) {
        Random random = new Random();
        numeroConto = random.nextInt(100000000);
        this.nomeCliente = nomeCliente;
        saldo = 0.00;
    }

    //GETTER
    public int getNumeroConto(){
        return numeroConto;
    }

    public String getNomeCliente(){
        return nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    //SETTER
    public void setNomeCliente(String nomeCliente){
        this.nomeCliente = nomeCliente;
    }

    // METODI

    // metodo per aggiungere soldi al saldo
    public double deposita(double money) {
        saldo += money;
        return saldo;
    }

    // metodo per prelevare soldi al saldo
    public double preleva(double money) {
        if (money <= 0) {
            System.out.println("Importo non valido.");
        } else if (money <= saldo) {
            saldo -= money;
        } else {
            return 0;
        }
        return saldo;
    }

    public String getFormattedCount() {
        return "Il saldo disponibile nel conto è: " + saldo + " €";
    }
}
