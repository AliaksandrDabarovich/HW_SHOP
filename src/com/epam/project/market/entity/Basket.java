package com.epam.project.market.entity;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private List<Goods> goodsList;

    public Basket() {
        goodsList = new ArrayList<>();
    }

    public void addGoods(Goods... goods) {
        for (Goods someGoods : goods) {
            goodsList.add(someGoods);
        }
    }

    public int totalPrice() {
        int sum;
        sum = 0;
        for (int i = 0; i < goodsList.size(); i++) {
            sum += goodsList.get(i).myPrice();
        }
        return sum;
    }

    public String check() {
        String multipleLines = "Покупки" +
                System.lineSeparator() +
                "" +
                "Товары" +
                System.lineSeparator();
        for (int i = 0; i < goodsList.size(); i++) {
            Goods goods = goodsList.get(i);
            multipleLines += goods.myTitle() + " " + goods.myPrice() + System.lineSeparator();
        }
        multipleLines += "Итоговая сумма " + System.lineSeparator();
        multipleLines += totalPrice();
        return multipleLines;
    }

    public void print(String result) {
        System.out.println(result);
    }
}
