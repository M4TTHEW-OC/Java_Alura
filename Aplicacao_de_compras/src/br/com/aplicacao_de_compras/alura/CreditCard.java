package br.com.aplicacao_de_compras.alura;

import java.util.ArrayList;
import java.util.List;

public class CreditCard {

    private double cardLimit;

    private double balance;

    private List<Purchase> buy;

    public CreditCard(double cardLimit) {
        this.cardLimit = cardLimit;
        this.balance = cardLimit;
        this.buy = new ArrayList<>();
    }

    public boolean launchPurchase(Purchase buy) {

        if (this.balance >= buy.getValue()){
            this.balance -= buy.getValue();
            this.buy.add(buy);

            return true;
        }

        return false;
    }

    public CreditCard() {
    }

    public double getCardLimit() {
        return cardLimit;
    }

    public double getBalance() {
        return balance;
    }

    public List<Purchase> getBuy() {
        return buy;
    }



}
