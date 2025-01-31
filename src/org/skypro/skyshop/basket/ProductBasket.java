package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class ProductBasket {
    static List<Product> basket = new LinkedList<>();

    // Добавление товара
    public void addProduct(Product product) {
        basket.add(product);
    }

    // удаление товара по имени
    public void deletProductToName(String name) {
        List<Product> deletProductToName = new LinkedList<>();
        System.out.println("Удаление продукта по имени:" + name);

        Iterator<Product> iterator = basket.iterator();

        while (iterator.hasNext()) {
            Product element = iterator.next();
            if (element.getName().equals(name)) {
                deletProductToName.add(element);
                iterator.remove();
            }

        }
        if (deletProductToName.isEmpty()) {
            System.out.println("Список пуст.");
        }
        System.out.println("Удалено: " + deletProductToName);
    }

    // подсчет специальных товаров
    public int isSpecialProduct() {
        int count = 0;
        boolean result;
        for (int i = 0; i < basket.size(); i++) {
            if (basket.get(i) != null) {
                Product product = basket.get(i);

                result = product.isSpecial();

                if (result == true) {
                    count++;
                }

            }
        }
        return count;
    }

    // получение стоимости корзины
    public double getBasketCost() {
        double total = 0;
        for (int i = 0; i < basket.size(); i++) {
            if (basket.get(i) != null) {
                Product product = basket.get(i);
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
        for (int i = 0; i < basket.size(); i++) {
            if (basket.get(i) != null) {
                Product product = basket.get(i);
                System.out.println(product);
                isEmpty = false;
            }
        }
        if (!isEmpty) {
            System.out.println("Итого: " + getBasketCost());
            System.out.println("Специальных товаров: " + isSpecialProduct());
        } else {
            System.out.println("В корзине пусто");

        }

    }

    //поиск товара
    public boolean searchProduct(String productNick) {
        boolean exist = false;
        for (int i = 0; i < basket.size(); i++) {
            Product product = basket.get(i);
            if (basket.get(i) == null) {
                continue;
            }

            exist = (product.getName().equals(productNick));

        }
        return exist;
    }

    // очистка корзины
    public void cleanBasket() {
        for (int i = 0; i < basket.size(); i++) {
            basket.set(i, null);

        }
        System.out.println("корзина очищена");
    }


    public static void printSeparator() {
        System.out.println("-------------------------------------------------------------");
    }


}


