package com.epam.project.market.entity;

import java.io.Serializable;
import java.util.Objects;

public class Blender extends BaseGoods implements Appliances, Serializable {
    private int power;

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public Blender(int price, String title, int power) {
        super(price, title);
        this.power = power;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Blender)) return false;
        if (!super.equals(o)) return false;
        Blender blender = (Blender) o;
        return getPower() == blender.getPower();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getPower());
    }

    @Override
    public String toString() {
        return "Blender{" +
                "power=" + power +
                "} " + super.toString();
    }

    @Override
    public void myPower() {

    }
}
