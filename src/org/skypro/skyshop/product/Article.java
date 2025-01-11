package org.skypro.skyshop.product;

import org.skypro.skyshop.basket.Searchable;

public class Article implements Searchable {
    private final String titleArticle;
    private final String contentArticle;
    private String ARTICLE = "article";

    public Article(String titleArticle, String contentArticle) {
        this.titleArticle = titleArticle;
        this.contentArticle = contentArticle;
    }

    public String getTitleArticle() {
        return titleArticle;
    }

    public String getContentArticle() {
        return contentArticle;
    }

    @Override
    public String toString (){
        return titleArticle + System.lineSeparator() + contentArticle;
    }

    @Override
    public String getSearchTerm(){
        return titleArticle + contentArticle;
    };

    @Override
    public String getType(){
        return ARTICLE;
    }
}
