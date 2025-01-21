package org.skypro.skyshop.product;

public class PriceException extends IllegalArgumentException {
    private String name;

    public PriceException(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "(" + name + ") - введена некорректная стоимость";
    }

}