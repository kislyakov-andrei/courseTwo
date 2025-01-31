package org.skypro.skyshop.basket;


import org.skypro.skyshop.product.Product;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class SearchEngine {
    int count = 0;
    static List<Searchable> searchables = new LinkedList<>();


    public void add(Searchable searchable) {
        searchables.add(searchable);
    }

    // удаление товара по имени
    public void search(String name) {
        List<Searchable> search = new LinkedList<>();
        System.out.println("Поиск продукта " + name);

        Iterator<Searchable> iterator = searchables.iterator();

        while (iterator.hasNext()) {
            Searchable element = iterator.next();
            if (element.getName().toLowerCase().contains(name.toLowerCase())) {
                search.add(element);
            }

        }
        if (search.isEmpty()) {
            System.out.println("Продукт " + name + " не найден.");
        }
        System.out.println("Результат поиска: " + search);
    }


    public Searchable foundBestResult(String searchTerm) throws BestResultNotFound {
        Searchable[] result = new Searchable[5];

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
}


