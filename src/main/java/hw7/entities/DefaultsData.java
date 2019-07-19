package hw7.entities;


import hw7.enums.*;

import java.util.Arrays;

public class DefaultsData {

    public static MetalAndColors DEFAULT_DATA = new MetalAndColors().set(c-> {
        c.setOddSummaryNumber(OddSummaryNumber.OPTION_2.getNumber());
        c.setEvenSummaryNumber(EvenSummaryNumber.OPTION_4.getNumber());
        c.setElements(Arrays.asList(Element.WATER.getElement(), Element.FIRE.getElement()));
        c.setColor(Color.RED.getColor());
        c.setMetal(Metal.SELEN.getMetal());
        c.setVegetables(Arrays.asList(Vegetable.CUCUMBER.getVegetable(), Vegetable.TOMATO.getVegetable()));
    });
}
