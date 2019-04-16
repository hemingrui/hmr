package com.gupao.pattern.factory.factorymethod;

import com.gupao.pattern.factory.IDrink;
import com.gupao.pattern.factory.SpriteDrink;

public class SpriteFactory implements IDrinkFactory {
    public IDrink create() {
        return  new SpriteDrink();
    }
}
