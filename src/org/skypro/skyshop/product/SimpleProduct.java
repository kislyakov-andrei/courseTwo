package org.skypro.skyshop.product;

import org.skypro.skyshop.basket.Searchable;

public class SimpleProduct extends Product {
    private double cost;

    public SimpleProduct(String name, double cost) {
        super(name);
        if (cost <= 0) {
            throw new PriceException(name);
        }
        this.cost = cost;

    }

    @Override
    public double getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "\n" + name + " : " + cost;
    }

    @Override
    public boolean isSpecial() {
        return false;
    }

    @Override
    public int compareToIgnoreCase(Searchable o2) {
        return 0;
    }
}


