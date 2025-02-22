package org.skypro.skyshop.basket;

import static java.sql.DatabaseMetaData.typeSearchable;

public interface Searchable {
    String getSearchTerm();

    String getType();

    String getName();

    default String getStringRepresentation() {

        return "имя объекта - " + getName() + " - тип объекта " + getType();

    }

    int compareToIgnoreCase(Searchable o2);
}
