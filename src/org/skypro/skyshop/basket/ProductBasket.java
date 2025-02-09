package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;

import java.util.*;


public class ProductBasket {
    // static List<Product> basket = new LinkedList<>();
    Map<String, List<Product>> basket = new HashMap<>();

    // Добавление товара
    public void addProduct(Product product) {
        String productName = product.getName();
        List productList = basket.computeIfAbsent(productName, k -> new ArrayList<>());
        productList.add(product);
        basket.put(productName, productList);
    }

    // удаление товара по имени
    public void deletProductToName(String name) {

        System.out.println("Удаление продукта по имени:" + name);
        if (basket.containsKey(name)) {
            basket.remove(name);
            System.out.println("Продукт " + name + " удален.");
        } else {
            System.out.println("Продукт " + name + " не найден");
        }
    }

    // подсчет специальных товаров
    public int isSpecialProduct() {
        int count = 0;
        for (List<Product> productList : basket.values()) {
            for (Product product : productList) {
                if (product.isSpecial()) {
                    count++;
                }
            }
        }
        return count;
    }

    // получение стоимости корзины
    public double getBasketCost() {
        double total = 0;
        for (List<Product> productList : basket.values()) {
            for (Product product : productList) {
                total += product.getCost();

            }
        }

        return total;
    }

    // печать корзины
    public void printBasket() {
        if (!basket.isEmpty()) {
            System.out.println(basket);
        } else {
            System.out.println("Корзина пустая.");

        }
    }

    //поиск товара
    public boolean searchProduct(String productNick) {
        boolean exist = false;
        exist = basket.containsKey(productNick);
        return exist;
    }

    // очистка корзины
    public void cleanBasket() {
        basket.clear();
        System.out.println("корзина очищена");
    }


    public static void printSeparator() {
        System.out.println("-------------------------------------------------------------");
    }


}


