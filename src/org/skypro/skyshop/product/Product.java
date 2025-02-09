package org.skypro.skyshop.product;

import org.skypro.skyshop.basket.Searchable;

import java.util.Objects;

public abstract class Product implements Searchable {
    protected String name;
    private static final String TYPEPRODUCT = "PRODUCT";

    public Product(String name) throws NameException {
        if (name == null || name.isBlank()) {
            throw new NameException();
        }

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
        return TYPEPRODUCT;
    }

    @Override
    public String getSearchTerm() {
        return getName();


    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
