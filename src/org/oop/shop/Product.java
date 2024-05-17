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
    public int vat;
    public String name, description;
    public double price;
    private String productCode;

    Random random = new Random();
    public Product(){
        int code = random.nextInt(10000);
        this.productCode = String.format("%06d", code); // Formatta con zeri a sinistra fino a 6 cifre
    }
    // COSTRUTTORE
    public Product(int productCode, int vat, String name, String description, double price) {
        int code = random.nextInt(10000);
        this.productCode = String.format("%06d", code);
        this.vat = vat;
        this.name = name;
        this.description = description;
        this.price = price;
    }
    //METODI

    @Override
    public String toString() {
        return "Product " +
                "{code='" + String.format("%6s" , productCode).replace(' ', '0') +
                "', name='" + name +
                "', description='" + description +
                "', price='" + price +
                "', vat='" + vat + "'}";
    }

    public String getProductCode() {
        return productCode;
    }

    public double getPrice() {
        return price;
    }

    public int getVat() {
        return vat;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    double getPriceVat(){
        return price + (price*vat/100);
    }

    String getFullName(){
        return productCode + "-" + name;
    }
}
