package org.skypro.skyshop.product;

public class FullBasketException extends RuntimeException{
    String name;

    public FullBasketException() {


    }

    @Override
    public String toString() {
        return "продукт не может быть добавлен.В корзине нет места. ";
    }
}
