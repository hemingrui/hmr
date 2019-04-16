package com.gupao.pattern.factory.abstractFactory;

public class ColaDrinkFactory implements DrinkFacotory{

    public ISee createSee() {
        return new ColaSee();
    }

    public IPlay createPlay() {
        return new ColaPlay();
    }
}
