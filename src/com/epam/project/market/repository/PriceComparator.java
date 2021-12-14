package com.epam.project.market.repository;

import com.epam.project.market.entity.Cup;

import java.util.Comparator;

public class PriceComparator implements Comparator<Cup> {
    @Override
    public int compare(Cup o1, Cup o2) {
        return o1.getPrice() - o2.getPrice();
    }
}
