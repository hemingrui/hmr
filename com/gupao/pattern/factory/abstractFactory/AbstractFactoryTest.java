package com.gupao.pattern.factory.abstractFactory;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        DrinkFacotory drinkFacotory = new ColaDrinkFactory();
        IPlay  iPlay = drinkFacotory.createPlay();
        iPlay.play();
    }
}
