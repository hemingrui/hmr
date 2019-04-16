package com.gupao.pattern.factory.simpleFactory;

import com.gupao.pattern.factory.IDrink;

public class DrinkFactoryTest {
    public static void main(String[] args) {
        DrinkFactory drinkFactory = new DrinkFactory();
        IDrink  iDrink  = drinkFactory.create("sprite");
        iDrink.product();
    }
}
