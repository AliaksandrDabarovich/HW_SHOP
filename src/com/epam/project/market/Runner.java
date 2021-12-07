package com.epam.project.market;

import com.epam.project.market.entity.Basket;
import com.epam.project.market.entity.Blender;
import com.epam.project.market.entity.ChristmasToy;
import com.epam.project.market.entity.Cup;
import com.epam.project.market.entity.Speaker;

public class Runner {
    public static void main(String[] args) {
        Blender blender = new Blender(10, "Bosh", 200);
        ChristmasToy christmasToy = new ChristmasToy(20, "Dog", "Red");
        Cup cup = new Cup(30, "Tea cup", 110);
        Speaker speaker = new Speaker(40, "Sony", 100);

        Basket basket = new Basket();
        basket.addGoods(blender, christmasToy, cup, speaker);

        String result = basket.check();

        basket.print(result);

    }

}
