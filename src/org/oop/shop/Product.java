package org.oop.shop;
/*
Esercizio 1: Java Shop :carello_della_spesa:
Creare la classe Prodotto che gestisce i prodotti dello shop.
Un prodotto è caratterizzato da:
- codice (numero intero)
- nome
- descrizione
- prezzo
- iva
Usate opportunamente i livelli di accesso (public, private), i costruttori, i metodi getter e setter ed eventuali altri metodi di “utilità” per fare in modo che:
- alla creazione di un nuovo prodotto il codice sia valorizzato con un numero random OK!
- il codice prodotto sia accessibile solo in lettura e deve essere restituito come Stringa con un padleft a 6 caratteri (es. codice 15->“000015") OK!
- gli altri attributi siano accessibili sia in lettura che in scrittura OK!
- il prodotto esponga un metodo per avere il prezzo base OK!
- il prodotto esponga un metodo per avere il prezzo comprensivo di iva OK!
- il prodotto esponga un metodo per avere il nome esteso, ottenuto concatenando codice-nome
Nello stesso package aggiungete una classe Main con metodo main nella quale testate tutte le funzionalità della classe Prodotto.*/

import java.util.Random;
public class Product {
    private String productCode;
    private int vat;
    private String name;
    private String description;
    private double price;

    // Random per generare il codice del prodotto
    private final Random random = new Random();

    // Costruttore che genera un codice random
    public Product() {
        int code = random.nextInt(1000000);
        this.productCode = String.format("%06d", code);
    }

    // Costruttore con tutti i parametri
    public Product(String name, String description, double price, int vat) {
        int code = random.nextInt(1000000);
        this.productCode = String.format("%06d", code);
        this.name = name;
        this.description = description;
        this.price = price;
        this.vat = vat;
    }

    // Metodi getter e setter

    public String getProductCode() {
        return productCode;
    }

    public int getVat() {
        return vat;
    }

    public void setVat(int vat) {
        this.vat = vat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Metodo per ottenere il prezzo base
    public double getBasePrice() {
        return price;
    }

    // Metodo per ottenere il prezzo comprensivo di IVA
    public double getPriceWithVat() {
        return price + (price * vat / 100);
    }

    // Metodo per ottenere il nome esteso (codice-nome)
    public String getFullName() {
        return productCode + "-" + name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productCode='" + productCode + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", vat=" + vat +
                '}';
    }

}
