package com.epam.project.market.entity;

import java.io.Serializable;
import java.util.Objects;

public class Speaker extends BaseGoods implements Appliances, Serializable {
    private int power;

    public Speaker(int price, String title, int power) {
        super(price, title);
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Speaker)) return false;
        if (!super.equals(o)) return false;
        Speaker speaker = (Speaker) o;
        return getPower() == speaker.getPower();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getPower());
    }

    @Override
    public String toString() {
        return "Speaker{" +
                "power=" + power +
                "} " + super.toString();
    }

    @Override
    public void myPower() {
        System.out.println(power);
    }
}
