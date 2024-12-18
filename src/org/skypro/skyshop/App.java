package org.skypro.skyshop;
import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.Product;

import static org.skypro.skyshop.basket.ProductBasket.printSeparator;



public class App {

    public static void main(String[] args) {
        Product product = new Product("хлеб", 120);
printSeparator();
        ProductBasket basket = new ProductBasket();
        basket.addProduct(product);


        System.out.println(product.getName());
        System.out.println(product.getCost());


    }

    }


