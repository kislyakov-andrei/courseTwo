package org.skypro.skyshop.product;

public class Product {
    private String name;
    private int cost;

    public Product(String name, int cost) {
        if (name==null || name.isBlank()) {
            throw new IllegalArgumentException("некорректно введен товар");
        }
        if (cost<=0){
            throw new IllegalArgumentException("некорректная стоимость");
        }
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }
    @Override
    public String toString(){
        return name + " : " + cost;
    }
}
