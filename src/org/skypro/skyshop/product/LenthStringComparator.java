package org.skypro.skyshop.product;

import org.skypro.skyshop.basket.Searchable;

import java.util.Comparator;

    public class LenthStringComparator implements Comparator<Searchable> {
        @Override
        public int compare(String s1, String s2) {
            int lengthComparison = Integer.compare(s2.length(), s1.length());

            // Если длины равны, сравниваем имена
            if (lengthComparison == 0) {
                return s1.compareToIgnoreCase(s2);

            }

            return lengthComparison;
        }

    }

