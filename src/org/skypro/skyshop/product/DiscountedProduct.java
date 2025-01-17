package org.skypro.skyshop.product;

public class DiscountedProduct extends Product {
    private double cost;
    //private double price;
    private int discount;

    public DiscountedProduct(String name, double cost, int discount) {
        super(name);
        if (cost <= 0) {
            throw new PriceException(name);
        }
        if (discount < 0 || discount > 100) {
            throw new DiscountException(name);
        }
        this.cost = cost * (1 - discount / 100.0);
        this.discount = discount;

    }

    @Override
    public double getCost() {
        //price= cost*(1-discount/100.0);
        return cost;
    }

    @Override
    public String toString() {
        return name + " : " + cost + " (" + discount + "% )";
    }

    @Override
    public boolean isSpecial() {
        return true;
    }

}
