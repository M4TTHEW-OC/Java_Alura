package br.com.aplicacao_de_compras.alura;

import java.util.Collections;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {

        Scanner reading = new Scanner(System.in);

        System.out.println("Informe o limite do cartão: ");

        double limit =reading.nextDouble();
        CreditCard creditCard = new CreditCard(limit);

        int exit = 1;

        while (exit != 0) {
            System.out.println("Digite a descrição da compra: ");
            String description = reading.next();

            System.out.println("Digite o valor da compra: ");
            double value = reading.nextDouble();

            Purchase shopping = new Purchase(description, value);
            boolean purchaseMade = creditCard.launchPurchase(shopping);

            if (purchaseMade) {
                System.out.println("Compra realizada");
                System.out.println("Digite 0 para sair ou 1 para continuar");
                exit = reading.nextInt();

            } else {
                System.out.println("Saldo insuficiente!");
                exit = 0;
            }
        }

        System.out.println("***********************");
        System.out.println("COMPRAS REALIZADAS:\n");

        Collections.sort(creditCard.getBuy());

        for (Purchase c : creditCard.getBuy()) {
            System.out.println(c.getDescription() + " - " +c.getValue());
        }
        System.out.println("\n***********************");

        System.out.println("\nSaldo do cartão: " +creditCard.getBalance());


    }
}




