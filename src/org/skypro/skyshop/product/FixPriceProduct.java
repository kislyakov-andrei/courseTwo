package org.skypro.skyshop.product;

public class FixPriceProduct extends Product {
    private double FIX_PRICE = 50.0;
    private double cost;

    public FixPriceProduct(String name) {
        super (name);
        this.cost = FIX_PRICE;

    }

    @Override
    public double getCost() {

        return  FIX_PRICE;
    }

    @Override
    public String toString() {
        return name + " : Фиксированная цена " + cost;
    }
    @Override
    public boolean isSpecial(){
        return true;
    }
}
