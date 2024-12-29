package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.DiscountedProduct;
import org.skypro.skyshop.product.Product;
import org.skypro.skyshop.product.SimpleProduct;

import static org.skypro.skyshop.basket.ProductBasket.printSeparator;


public class App {

    public static void main(String[] args) {
         Product product = new SimpleProduct("масло", 320.0);

        Product product1 = new SimpleProduct("хлеб", 120.0);
        Product product2 = new SimpleProduct("соль", 30.0);
        Product product3 = new DiscountedProduct("сыр", 350.0, 20);
        //Product product4 = new Product("мясо", 800);
       // Product product5 = new Product("рыба", 310);

        printSeparator();
        ProductBasket basket = new ProductBasket();// вызов метода "добавление продукта"
        basket.addProduct(product);
        basket.addProduct(product1);
        basket.addProduct(product2);
        basket.addProduct(product3);
       // basket.addProduct(product4);
        //basket.addProduct(product5);

        System.out.println("общая стоимость :" + basket.getBasketCost());// вызов метода "общая стоимость корзины"
        printSeparator();
        basket.printBasket();// вызов метода "печать содержимого корзины"
        printSeparator();
        System.out.println(basket.searchProduct("соль"));// вызов метода "поиск продукта"
        System.out.println(product2.getName());
        printSeparator();
        basket.cleanBasket();// вызов метода "очистка корзины"
        basket.printBasket();// проверка очищения корзины
        System.out.println(product3.getCost());

    }

}


