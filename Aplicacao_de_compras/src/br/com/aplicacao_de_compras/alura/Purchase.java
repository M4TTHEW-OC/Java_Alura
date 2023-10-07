package br.com.aplicacao_de_compras.alura;

public class Purchase implements Comparable<Purchase>{

    private String description;

    public double value;

    public Purchase(String description, double value) {
        this.description = description;
        this.value = value;
    }

    public String getDescription() {
        return description;
    }

    public double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Compra: " + "description = " + description  + ", Valor =" + value;
    }


    @Override
    public int compareTo(Purchase otherPurchases) {
        return Double.valueOf(this.value).compareTo(Double.valueOf(otherPurchases.value));
    }
}
