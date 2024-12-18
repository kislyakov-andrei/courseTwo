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
            System.out.println("в корзине нет места");
        }
    }

    public static void printSeparator() {
        System.out.println("-------------------------------------------------------------");
    }


}


