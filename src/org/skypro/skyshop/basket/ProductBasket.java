package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;


public class ProductBasket {
    int count = 0;

    static Product[] basket = new Product[5];

    // Добавление товара
    public void addProduct(Product product) {
        for (int i = 0; i < basket.length; i++) {

            if (basket[i] == null) {
                basket[i] = product;
                return;
            }
        }
        throw new RuntimeException("Невозможно добавить продукт"); //System.out.println("в корзине нет места");
    }

    // получение стоимости корзины
    public double getBasketCost() {
        double total = 0;
                for (int i = 0; i < basket.length; i++) {
            if (basket[i] != null) {
                Product product = basket[i];
                double cost = product.getCost();
                total += cost;

            }
            if (total <= 0) {
                System.out.println("корзина пустая");
                break;
            } //throw new IllegalArgumentException("корзина пустая");
        }
        return total;
    }

    // печать корзины
    public void printBasket() {
        boolean isEmpty = true;
        for (int i = 0; i < basket.length; i++) {
            if (basket[i] != null) {
                Product product = basket[i];
                System.out.println(product);
                isEmpty = false;
            }
        }
        if (!isEmpty) {
            System.out.println("Итого: " + getBasketCost());
        } else {
            System.out.println("В корзине пусто");

        }

    }

    //поиск товара
    public boolean searchProduct(String productNick) {
        boolean exist = false;
        for (int i = 0; i < basket.length; i++) {
            Product product = basket[i];
            if (basket[i] == null) {
                continue;
            }

            exist = (product.getName().equals(productNick));

        }
        return exist;
    }

    // очистка корзины
    public void cleanBasket() {
        for (int i = 0; i < basket.length; i++) {
            basket[i] = null;

        }
        System.out.println("корзина очищена");
    }

    public static void printSeparator() {
        System.out.println("-------------------------------------------------------------");
    }


}


