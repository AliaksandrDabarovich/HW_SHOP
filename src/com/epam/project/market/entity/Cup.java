package com.epam.project.market.entity;

import java.util.Objects;

public class Cup extends BaseGoods{
    private int maxTemperature;

    public Cup(int price, String title, int maxTemperature) {
        super(price, title);
        this.maxTemperature = maxTemperature;
    }

    public int getMaxTemperature() {
        return maxTemperature;
    }

    public void setMaxTemperature(int maxTemperature) {
        this.maxTemperature = maxTemperature;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cup)) return false;
        if (!super.equals(o)) return false;
        Cup cup = (Cup) o;
        return getMaxTemperature() == cup.getMaxTemperature();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getMaxTemperature());
    }

    @Override
    public String toString() {
        return "Cup{" +
                "maxTemperature=" + maxTemperature +
                "} " + super.toString();
    }
}
