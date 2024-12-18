package org.skypro.skyshop;
import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.Product;

import static org.skypro.skyshop.basket.ProductBasket.printSeparator;



public class App {

    public static void main(String[] args) {
        Product product = new Product("масло", 320);
        Product product1 = new Product("хлеб", 120);

printSeparator();
        ProductBasket basket = new ProductBasket();
        basket.addProduct(product);
        basket.addProduct(product1);

        System.out.println("общая стоимость :" + basket.getBasketCost());



        System.out.println(product1.getName());
        System.out.println(product1.getCost());


    }

    }

