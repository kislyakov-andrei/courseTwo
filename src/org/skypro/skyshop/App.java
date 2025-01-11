package org.skypro.skyshop;
import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.basket.SearchEngine;
import org.skypro.skyshop.basket.Searchable;
import org.skypro.skyshop.product.*;

import static org.skypro.skyshop.basket.ProductBasket.printSeparator;


public class App {


    public static void main(String[] args) {
        Product product = new DiscountedProduct("масло", 320.0, 10);

        Product product1 = new SimpleProduct("хлеб", 120.0);
        Product product2 = new SimpleProduct("соль", 30.0);
        Product product3 = new DiscountedProduct("масло", 350.0, 20);
        // Product product4 = new FixPriceProduct("мясо");
        // Product product5 = new Product("рыба", 310);
        Product product6 = new FixPriceProduct("водка");

        printSeparator();
        ProductBasket basket = new ProductBasket();// вызов метода "добавление продукта"
        basket.addProduct(product);
        basket.addProduct(product1);
        basket.addProduct(product2);
        basket.addProduct(product3);
        //basket.addProduct(product4);
        //basket.addProduct(product5);
        basket.addProduct(product6);

        System.out.println("общая стоимость :" + basket.getBasketCost());// вызов метода "общая стоимость корзины"
        printSeparator();
        basket.printBasket();// вызов метода "печать содержимого корзины"
        printSeparator();
        System.out.println(basket.searchProduct("водка"));// вызов метода "поиск продукта"

        System.out.println("искомый продукт - " + product6.getName()); // какой продукт ищем, подсказка
        printSeparator();
        // basket.cleanBasket();// вызов метода "очистка корзины"
        basket.printBasket();// проверка очищения корзины

        printSeparator();
        System.out.println("Поиск");
        System.out.println();
        Article article1 = new Article("Сыр", "История создания продукта");
        Article article2 = new Article("Крепкие алкогольные напитки", "Русская водка - рецепт домашнего приготовления");
        Article article3 = new Article("Хлеб всему голова", "Интересные факты о появлении хлеба на столе славянских народов");
        Article article4 = new Article("Соль", "Может ли человек прожить без соли");
        System.out.println(article3.getContentArticle());
        System.out.println(article1.getTitleArticle());
        searchEngine.add(product2);
        // Searchable[] searchResults = searchEngine.search ("product");

    }

}


