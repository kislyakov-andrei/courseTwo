package org.skypro.skyshop.product;

import org.skypro.skyshop.basket.Searchable;

import java.util.Comparator;

    public class LenthStringComparator implements Comparator<Searchable> {
        @Override
        public int compare(Searchable o1, Searchable o2) {
            int lengthComparison = Integer.compare(o2.getSearchTerm().length(), o1.getSearchTerm().length());

            // Если длины равны, сравниваем имена
            if (lengthComparison == 0) {
                return o1.compareToIgnoreCase(o2);

            }

            return lengthComparison;
        }

            }

