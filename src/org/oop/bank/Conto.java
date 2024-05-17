package org.oop.bank;

import java.util.Random;

/*
Creare la classe Conto caratterizzata da:
- numero di conto
- nome del proprietario
- saldo
Usate opportunamente i livelli di accesso (public, private), i costruttori, i metodi getter e setter ed eventuali altri metodi di “utilità” per fare in modo che:
- alla creazione di un nuovo conto il saldo sia 0€
-   Il codice conto sia accessibile solo in lettura,
    il proprietario sia accessibile in lettura e in scrittura
    il saldo sia accessibile solo in lettura
- siano presenti un metodo per versare una somma di denaro sul conto e uno per prelevare una somma di denaro dal conto
    (attenzione: il saldo non può mai diventare negativo)
- altri metodi per ritornare le informazioni del conto e il saldo formattato
Aggiungere una classe Bank con metodo main, dove chiediamo all’utente il suo nome e generiamo un Conto intestato all’utente con un numero di conto random (da 1 a 1000)
Poi chiediamo all’utente cosa vuole fare dando 3 opzioni: versare una somma o prelevare una somma di denaro o uscire.
Dopo la scelta dell’utente chiediamo quanti soldi vuole versare o prelevare e proviamo ad effettuare l’operazione sul conto. Se l’operazione non è valida mostriamo un messaggio di errore.
Se l’operazione va a buon fine mostriamo il saldo attuale del conto. Il menu continua ad apparire fino a che l’utente sceglie di uscire.
*/
public class Conto {
    private int number;
    private String name;
    private double balance;
    Random random = new Random(1000);
    // COSTRUTTORE
    public Conto() {
        balance = 0.00;
        number = random.nextInt(1000);
    }

    //METODI


    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    void deposit(double n){
        balance += n;
    }

    void withdrawal(double n){
        if (balance < n){
            System.out.println("Prelievo non riuscito per mancanza di fondi!!");
        } else{
            balance -=n;
        }

    }

    @Override
    public String toString() {
        return "Conto {Nome: " + name +
                ", Numero: " + number +
                ", Saldo:" + balance + "$}";
    }
}
