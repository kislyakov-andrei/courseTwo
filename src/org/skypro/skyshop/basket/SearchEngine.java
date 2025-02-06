package org.skypro.skyshop.basket;


import org.skypro.skyshop.product.Product;

import java.util.*;

public class SearchEngine {

    private List<Searchable> searchables = new LinkedList<>();


    public void add(Searchable searchable) {
        searchables.add(searchable);
    }

    // поиск товара по имени
    public Map<String, Searchable> search(String name) {
        System.out.println("Поиск продукта " + name);
        Map<String, Searchable> searchResult = new TreeMap<>();

        for (Searchable searchable : searchables) {

            if (searchable.getSearchTerm().toLowerCase().contains(name.toLowerCase())) {
                searchResult.put(searchable.getStringRepresentation(), searchable);
            }
        }
        return searchResult;

    }


    public Searchable foundBestResult(String searchTerm) throws BestResultNotFound {
        Searchable bestResult = null;
        int maxFound = 0;
        int score;
        for (Searchable searchable : searchables) {
            String str = searchable.getSearchTerm().toLowerCase();
            String subStr = searchTerm.toLowerCase();
            score = resultMaxFound(str, subStr);
            if (score > maxFound) {
                maxFound = score;
                bestResult = searchable;
            } else if (bestResult == null) {
                throw new BestResultNotFound(searchTerm);
            }

        }
        return bestResult;
    }


    private int resultMaxFound(String str, String subStr) {
        int score = 0;
        int index = 0;
        int indexSubStr = str.indexOf(subStr, index);
        while (indexSubStr != -1) {
            score++;
            index = indexSubStr + subStr.length();
            indexSubStr = str.indexOf(subStr, index);
        }
        return score;
    }

    // печать корзины
    public void printSearchebles() {
        if (!searchables.isEmpty()) {
            System.out.println(searchables);
        } else {
            System.out.println("Корзина пустая.");
        }
    }


}


