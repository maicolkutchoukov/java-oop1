package org.oop.bank;

import java.util.Objects;
import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Conto conto1 = new Conto();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci il tuo nome: ");
        conto1.setName(scanner.nextLine());
        String choice;
        do {
            System.out.print("Che operazione vuoi fare? (p: Prelievo / d: Deposito / u: Uscire)");
            choice = scanner.nextLine();
            if (Objects.equals(choice, "p")) {
                System.out.print("Quanto vuoi prelevare? Digita 'u' per annullare.");
                if (scanner.hasNextDouble()) {
                    double amount = scanner.nextDouble();
                    scanner.nextLine();
                    conto1.withdrawal(amount);
                } else {
                    String annulla = scanner.nextLine();
                    if (Objects.equals(annulla, "u")) {
                        System.out.println("Operazione annullata");
                    } else {
                        System.out.println("Input non valido");
                    }
                }
            } else if (Objects.equals(choice, "d")) {
                System.out.print("Quanto vuoi depositare? Digita 'u' per annullare.");
                if (scanner.hasNextDouble()) {
                    double amount = scanner.nextDouble();
                    scanner.nextLine();
                    conto1.deposit(amount);
                } else {
                    String annulla = scanner.nextLine();
                    if (Objects.equals(annulla, "u")) {
                        System.out.println("Operazione annullata");
                    } else {
                        System.out.println("Input non valido");
                    }
                }
            } else if (Objects.equals(choice, "u")) {
                System.out.println("Uscita dal programma.");
            } else {
                System.out.println("ERRORE, digita il carattere giusto!");
            }
            System.out.println("Saldo: " + conto1.getBalance() + "$");
        } while (!Objects.equals(choice, "u"));
        System.out.println(conto1.toString());
        scanner.close();
    }
}
