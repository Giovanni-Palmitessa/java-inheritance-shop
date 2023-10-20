package org.lessons.java.shop;

public class Main {
    public static void main(String[] args) {
        //creazione prodotti
        Prodotto prodotto1 = new Prodotto("iPhone 15", "L'iPhone più potente di sempre", 1500.0, 22);
        System.out.println("Prodotto 1:");
        System.out.println("Nome Completo: " + prodotto1.getCompleteName());
        System.out.println("Prezzo con IVA: " + prodotto1.getPriceIva());

        Prodotto prodotto2 = new Prodotto("Omen HP", "Il Pc portatile più sottile al mondo", 1900.0, 22);
        System.out.println("Prodotto 2:");
        System.out.println("Nome Completo: " + prodotto2.getCompleteName());
        System.out.println("Prezzo con IVA: " + prodotto2.getPriceIva());

        Prodotto prodotto3 = new Prodotto("Pasta Barilla", "La Pasta Italiana più buona al mondo", 2.0, 4);
        System.out.println("Prodotto 3:");
        System.out.println("Nome Completo: " + prodotto3.getCompleteName());
        System.out.println("Prezzo con IVA: " + prodotto3.getPriceIva());
    }
}
