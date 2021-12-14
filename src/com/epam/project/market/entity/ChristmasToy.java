package com.epam.project.market.entity;

import java.util.Objects;

public class ChristmasToy extends BaseGoods{
    private Color color;

    public ChristmasToy(int price, String title, Color color) {
        super(price, title);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
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
