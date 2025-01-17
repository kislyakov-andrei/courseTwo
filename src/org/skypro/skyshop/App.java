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

            //Product product = new DiscountedProduct("масло", 320.0, 10);

            Product product1 = new SimpleProduct("хлеб", 120.0);
            Product product2 = new SimpleProduct("соль", 20);
            Product product3 = new DiscountedProduct("масло", 320.0, 10);
            // проверка обработки исключения
            Product product4 = new FixPriceProduct("конфеты");
            // Product product5 = new SimpleProduct("рыба", 310);
            Product product6 = new FixPriceProduct("водка");
            printSeparator();
            ProductBasket basket = new ProductBasket();
            // basket.addProduct(product);
            basket.addProduct(product1);
            basket.addProduct(product2);
            basket.addProduct(product3);
            basket.addProduct(product4);
            //basket.addProduct(product5);
            basket.addProduct(product6);


            // вызов метода "добавление продукта"

            System.out.println("общая стоимость :" + basket.getBasketCost());// вызов метода "общая стоимость корзины"
            printSeparator();
            basket.printBasket();// вызов метода "печать содержимого корзины"
            printSeparator();

            printSeparator();
            // basket.cleanBasket();// вызов метода "очистка корзины"
            //basket.printBasket();// проверка очищения корзины

            printSeparator();
            System.out.println("Поиск");
            System.out.println();
            Article article1 = new Article("Хлеб", "История создания продукта");
            Article article2 = new Article("Крепкие алкогольные напитки, водка", "Русская водка - рецепт домашнего приготовления");
            Article article3 = new Article("Хлеб всему голова", "Интересные факты о появлении хлеба на столе славянских народов.Сорта хлеба.");
            Article article4 = new Article("Соль", "Может ли человек прожить без соли");
            Article article5 = new Article("Хлопушка", "Шумные развлечения на праздники");

            SearchEngine searchEngine = new SearchEngine(10);

            searchEngine.add(product1);
            searchEngine.add(product2);
            searchEngine.add(product3);
            //searchEngine.add(product5);
            searchEngine.add(product4);
            searchEngine.add(product6);
            searchEngine.add(article2);
            searchEngine.add(article1);
            searchEngine.add(article3);
            searchEngine.add(article5);
            searchEngine.add(article4);

            Searchable[] searchResult1 = searchEngine.search("водка");
            //Searchable[] searchResult = searchEngine.search("хлеб");
            System.out.println(Arrays.toString(searchResult1));
            //System.out.println(Arrays.toString(searchResult));
            System.out.println(article1.getStringRepresentation());
            printSeparator();

             System.out.println(searchEngine.foundBestResult("хлеб"));


        } catch (NameExсeption e) {
            System.out.println("Некорректно введено название");
        } catch (PriceException e) {
            System.out.println(e);
        } catch (DiscountException e) {
            System.out.println(e);
        } catch (BestResultNotFound e) {
            System.out.println(e);
        }


    }
}

