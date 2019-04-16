package com.gupao.pattern.factory.abstractFactory;

public class SpriteDrinkFactory implements DrinkFacotory {
    public ISee createSee() {
        return new SpriteSee();
    }

    public IPlay createPlay() {
        return new SpritePlay();
    }
}
