package com.epam.project.market;

import com.epam.project.market.entity.Basket;
import com.epam.project.market.entity.Blender;
import com.epam.project.market.entity.ChristmasToy;
import com.epam.project.market.entity.Color;
import com.epam.project.market.entity.Cup;
import com.epam.project.market.entity.Speaker;
import com.epam.project.market.repository.MaxTemperatureComparator;
import com.epam.project.market.repository.PriceComparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        //Interface
        Blender blender = new Blender(10, "Bosh", 200);
        ChristmasToy christmasToy = new ChristmasToy(20, "Dog", Color.YELLOW);
        Cup cup = new Cup(30, "Tea cup", 110);
        Speaker speaker = new Speaker(40, "Sony", 100);

        Basket basket = new Basket();
        basket.addGoods(blender, christmasToy, cup, speaker);

        String result = basket.check();

        basket.print(result);

        //Interface, ENUM
        Cup cup1 = new Cup(100, "Tea", 250);
        Cup cup2 = new Cup(200, "Coffee", 100);
        Cup cup3 = new Cup(50, "Water", 200);
        Cup cup4 = new Cup(50, "Lemonad", 300);

        List<Cup> cupList = Arrays.asList(cup1, cup2, cup3, cup4);
        Collections.sort(cupList);

        System.out.println(cupList);

        Comparator comparator = new PriceComparator().thenComparing(new MaxTemperatureComparator());

        Collections.sort(cupList, comparator);
        System.out.println(cupList);

        ChristmasToy car = new ChristmasToy(100, "Batman car", Color.BROWN);
        System.out.println(car);


    }

}
