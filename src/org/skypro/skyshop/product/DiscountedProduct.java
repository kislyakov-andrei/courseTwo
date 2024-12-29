package org.skypro.skyshop.product;

public class DiscountedProduct extends Product {
    private double cost;
    private int discount;
    public DiscountedProduct(String name, double cost, int discount) {
        super (name);
        this.cost = cost;
        this.discount = discount;

    }

    @Override
    public double getCost() {

          return cost = cost*(1-discount/100.0);
           }

    @Override
    public String toString() {
        return name + " : " + cost + " (" + discount + "% )";
    }

}
