package com.gupao.pattern.factory.factorymethod;

import com.gupao.pattern.factory.ColaDrink;
import com.gupao.pattern.factory.IDrink;

public class ColaFactory implements IDrinkFactory {
    public IDrink create() {
        return  new ColaDrink();
    }
}
