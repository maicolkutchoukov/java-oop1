package org.oop.shop;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product();
        product1.setDescription("MacBook Air m2");
        product1.setPrice(1300);
        product1.setName("Computer");
        product1.setVat(22);
        Product product2 = new Product("Mele", "Succose", 3, 10);
        System.out.println(product1);
        System.out.println("Prezzo: " + product1.getPrice());
        System.out.println("Prezzo con Iva: " + product1.getPriceWithVat());
        System.out.println("Nome esteso: " + product1.getFullName());
        System.out.println("Mele:" + product2.toString());
    }
}
