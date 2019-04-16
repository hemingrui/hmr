package com.gupao.pattern.factory.factorymethod;

import com.gupao.pattern.factory.IDrink;

public class FactoryMethodTest {
    public static void main(String[] args) {

        IDrinkFactory iDrinkFactory = new ColaFactory();
        IDrink iDrink = iDrinkFactory.create();
        iDrink.product();

    }
}
