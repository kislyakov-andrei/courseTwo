package org.skypro.skyshop.product;

public class DiscountException extends IllegalArgumentException{
    String name;

    public DiscountException( String name) {
         this.name = name;
    }

    @Override
    public String toString() {
        return "(" + name + ") - введен некорректный размер скидки";
    }
}
