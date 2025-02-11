package org.skypro.skyshop;

import org.skypro.skyshop.basket.BestResultNotFound;
import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.basket.SearchEngine;
import org.skypro.skyshop.basket.Searchable;
import org.skypro.skyshop.product.*;

// import static org.skypro.skyshop.basket.ProductBasket.basket;
import java.util.Arrays;

import static org.skypro.skyshop.basket.ProductBasket.printSeparator;


public class App {


    public static void main(String[] args) {
        try {

            Product product = new DiscountedProduct("сахар", 100.0, 10);

            Product product1 = new SimpleProduct("Хлеб", 120.0);
            Product product2 = new SimpleProduct("соль", 20);
            Product product3 = new DiscountedProduct("масло", 320.0, 20);
            // проверка обработки исключения
            Product product4 = new FixPriceProduct("масло");
            Product product5 = new SimpleProduct("хлеб", 310);
            Product product6 = new FixPriceProduct("водка");
            printSeparator();
            ProductBasket basket = new ProductBasket();
            basket.addProduct(product);
            basket.addProduct(product1);
            basket.addProduct(product2);
            basket.addProduct(product3);
            basket.addProduct(product4);
            basket.addProduct(product5);
            basket.addProduct(product6);

            // вызов метода "добавление продукта"


            // System.out.println("общая стоимость :" + basket.getBasketCost());// вызов метода "общая стоимость корзины"
            printSeparator();
            basket.printBasket();// вызов метода "печать содержимого корзины"
            System.out.println("Стоимость корзины: " + basket.getBasketCost());
            System.out.println("Специальных продуктов: " + basket.isSpecialProduct());
            printSeparator();
            // вызов метода "очистка корзины"
            System.out.println("очистка корзины");
            //basket.cleanBasket();
            printSeparator();
            // проверка очищения корзины
            basket.printBasket();
            // поиск продукта
            System.out.println(basket.searchProduct("Хлеб"));
            printSeparator();

            // удаление продукта по имени
            // basket.deletProductToName("хлеб");
            printSeparator();
            basket.deletProductToName("пиво");
            printSeparator();
            basket.printBasket();

            printSeparator();
            System.out.println("Поиск");
            System.out.println();
            Article article1 = new Article("Хлеб", "История создания продукта");
            Article article2 = new Article("Крепкие алкогольные напитки, водка", "Русская водка - рецепт домашнего приготовления");
            Article article3 = new Article("Хлеб всему голова", "Интересные факты о появлении хлеба на столе славянских народов.Сорта хлеба.");
            Article article4 = new Article("Соль", "Может ли человек прожить без соли");
            Article article5 = new Article("Хлопушка", "Шумные развлечения на праздники");
            Article article6 = new Article("хлеб", "История");

            SearchEngine searchable = new SearchEngine();

            searchable.add(product1);
            searchable.add(product2);
            searchable.add(product3);
            searchable.add(product5);
            searchable.add(product4);
            searchable.add(product6);
            searchable.add(article2);
            searchable.add(article1);
            searchable.add(article3);
            searchable.add(article5);
            searchable.add(article6);
            searchable.add(article4);
            // searchable.printSearchebles();

            searchable.search("пиво");
            printSeparator();

            System.out.println(searchable.search("Хлеб"));

            //System.out.println(article1.getStringRepresentation());
            printSeparator();
            System.out.println("поиск наиболее часто встречающегося продукта");
            System.out.println(searchable.foundBestResult("хлеб"));


        } catch (NameException e) {
            System.out.println("Некорректно введено название");
        } catch (PriceException | DiscountException | BestResultNotFound e) {
            System.out.println(e);
        }


    }
}

