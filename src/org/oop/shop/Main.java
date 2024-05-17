package org.oop.shop;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product();
        product1.description = "MacBook Air m2";
        product1.price = 1300;
        product1.name = "Computer";
        product1.vat = 22;
        System.out.println(product1);
        System.out.println("Prezzo: " + product1.getPrice());
        System.out.println("Prezzo con Iva: " + product1.getPriceVat());
        System.out.println("Nome esteso: " + product1.getFullName());
    }
}
