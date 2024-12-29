package org.skypro.skyshop.product;

public abstract class Product {
     String name;

    public Product(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("некорректно введен товар");
        }
        // if (cost <= 0) {
        // throw new IllegalArgumentException("некорректная стоимость");
         //}
        this.name = name;


    }

    public String getName() {

        return name;
    }

    public abstract double getCost();


    @Override
    public String toString() {
        return name + " : " + getCost();
    }
}
