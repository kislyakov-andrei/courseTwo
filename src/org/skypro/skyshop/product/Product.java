package org.skypro.skyshop.product;

import org.skypro.skyshop.basket.Searchable;

public abstract class Product implements Searchable {
    String name;
    String searchTerm;
    String PRODUCT = "product";

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

    public abstract boolean isSpecial();

    public abstract double getCost();


    @Override
    public String toString() {
        return name + " : " + getCost();
    }

    @Override
    public String getType() {
        return PRODUCT;
    }

    @Override
    public String getSearchTerm() {
        return getName();


    }


}
