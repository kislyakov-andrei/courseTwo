package org.skypro.skyshop.basket;


public class SearchEngine {
    int count = 0;
    // private int size;
    Searchable[] searchables;

    public SearchEngine(int size) {
        this.searchables = new Searchable[size];

    }

    public void add(Searchable searchable) {
        if (count >= searchables.length) {
            System.out.println("Добавить объект невозможно!");
        }
        searchables[count] = searchable;
        count++;
    }


    public Searchable[] search(String searchTerm) {
        int countResalt = 0;
        Searchable[] result = new Searchable[5];
        for (Searchable searchable : searchables) {
            if (searchable == null) {
                continue;
            }
            if (searchable.getSearchTerm().toLowerCase().contains(searchTerm.toLowerCase())) {
                result[countResalt] = searchable;
                countResalt++;
            }
            if (countResalt == result.length) {
                break;
            }
        }
        return result;
    }

}
