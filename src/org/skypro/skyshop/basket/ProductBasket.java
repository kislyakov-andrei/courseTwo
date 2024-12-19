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
    public int getBasketCost() {
        int total = 0;
        for (int i = 0; i < basket.length; i++) {
            if (basket[i] != null) {
                Product product = basket[i];
                int cost = product.getCost();
                total += cost;

            }
            if (total <= 0) {
                throw new IllegalArgumentException("корзина пустая");
            }//System.out.println("корзина пустая");
            //break;}


        }
        return total;
    }

    // печать корзины
    public void printBasket() {
        for (int i = 0; i < basket.length; i++) {
            if (basket[i] == null) {
                continue;
            }
            Product product = basket[i];
            System.out.println(product);


        }  System.out.println("Итого: " + getBasketCost());

    }
    //поиск товара
    public boolean searchProduct(String productNick) {
boolean exist = false;
        for (int i = 0; i < basket.length; i++) {
              Product product = basket[i];
              if (basket[i]==null){
                  continue;
              }

             exist=(product.getName().equals(productNick));


        }return exist;
    }

    public static void printSeparator() {
        System.out.println("-------------------------------------------------------------");
    }


}


