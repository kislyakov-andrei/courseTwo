package org.skypro.skyshop.basket;

public class SearchEngine {
    int count = 0;
    private int size;
        Searchable[] searchables;

    public SearchEngine(int size) {
        this.size = size;
        this.searchables = new Searchable[size];
        Searchable[] searchables = new Searchable[size];
    }

    public void add(Searchable searchable) {

        for (int i = 0; i < size; i++){

             if (count == size) {
                System.out.println("Добавить объект невозможно!");
            } searchables [i] = searchable;
            count ++;
        }




    }

    public Searchable[] search(String searchTerm) {
        int countResalt = 0;
        Searchable[] result = new Searchable[5];
        for (int i = 0; i < countResalt; i++){
            searchables[i].getSearchTerm().toLowerCase();

            if (searchables[i].getSearchTerm().contains(searchTerm)){
                result [countResalt++] = searchables[i];
            }
            if (countResalt == 5) {
                break;
            }
        } return result;
    }


}
