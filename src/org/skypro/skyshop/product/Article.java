package org.skypro.skyshop.product;

import org.skypro.skyshop.basket.Searchable;

import java.util.Objects;

public class Article implements Searchable {
    private final String titleArticle;
    private final String contentArticle;
    private static final String TYPEARTICLE = "ARTICLE";

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
    public String toString() {
        return "\n" + titleArticle + ":\n" + contentArticle;
    }

    @Override
    public String getSearchTerm() {
        return titleArticle + "-" + contentArticle;
    }

    ;

    @Override
    public String getType() {
        return TYPEARTICLE;
    }

    @Override
    public String getName() {
        return titleArticle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Article article = (Article) o;
        return Objects.equals(titleArticle, article.titleArticle);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(titleArticle);
    }
}
