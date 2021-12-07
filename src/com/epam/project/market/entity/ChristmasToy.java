package com.epam.project.market.entity;

import java.util.Objects;

public class ChristmasToy extends BaseGoods{
    private String color;

    public ChristmasToy(int price, String title, String color) {
        super(price, title);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ChristmasToy)) return false;
        if (!super.equals(o)) return false;
        ChristmasToy that = (ChristmasToy) o;
        return Objects.equals(getColor(), that.getColor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getColor());
    }

    @Override
    public String toString() {
        return "ChristmasToy{" +
                "color='" + color + '\'' +
                "} " + super.toString();
    }


}
