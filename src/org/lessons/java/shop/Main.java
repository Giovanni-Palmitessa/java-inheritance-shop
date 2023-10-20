package org.lessons.java.shop;

public class Main {
    public static void main(String[] args) {
        Prodotto prodotto1 = new Prodotto("iPhone 15", "L'iPhone più potente di sempre", 1500.0, 22);
        System.out.println(prodotto1.getCodice());
    }
}
