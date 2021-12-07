package com.epam.project.market.entity;

import java.io.Serializable;
import java.util.Objects;

public class BaseGoods implements Goods, Serializable {
    private int price;
    private String title;

    public BaseGoods(int price, String title) {
        this.price = price;
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public int myPrice() {
        return price;
    }

    @Override
    public String myTitle() {
        return title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BaseGoods)) return false;
        BaseGoods baseGoods = (BaseGoods) o;
        return getPrice() == baseGoods.getPrice() &&
                Objects.equals(getTitle(), baseGoods.getTitle());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPrice(), getTitle());
    }

    @Override
    public String toString() {
        return "BaseGoods{" +
                "price=" + price +
                ", title='" + title + '\'' +
                '}';
    }
}
