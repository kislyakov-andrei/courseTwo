package org.skypro.skyshop.product;

public class SimpleProduct extends Product {
    private double cost;
        public SimpleProduct(String name, double cost) {
        super (name);
             if (cost <= 0) {
             throw new IllegalArgumentException("некорректная стоимость");
            }
        this.cost = cost;

    }

    @Override
    public double getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return name + " : " + cost;
    }
}


