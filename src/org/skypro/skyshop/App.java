package org.skypro.skyshop;
import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.Product;

import static org.skypro.skyshop.basket.ProductBasket.printSeparator;



public class App {

    public static void main(String[] args) {
        Product product = new Product("масло", 320);
        Product product1 = new Product("хлеб", 120);
        Product product2 = new Product("соль", 30);
        Product product3 = new Product("сыр", 350);
        Product product4 = new Product("мясо", 800);
        Product product5 =new Product("рыба",310);

printSeparator();
        ProductBasket basket = new ProductBasket();
        basket.addProduct(product);
        basket.addProduct(product1);
        //basket.addProduct(product2);
        //basket.addProduct(product3);
        //basket.addProduct(product4);
        // basket.addProduct(product5);

        System.out.println("общая стоимость :" + basket.getBasketCost());
printSeparator();
basket.printBasket();

    }

    }


