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

}
