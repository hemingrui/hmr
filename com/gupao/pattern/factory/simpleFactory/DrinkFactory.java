package com.gupao.pattern.factory.simpleFactory;

import com.gupao.pattern.factory.ColaDrink;
import com.gupao.pattern.factory.IDrink;
import com.gupao.pattern.factory.SpriteDrink;

public class DrinkFactory  {

    public IDrink create(String name){
        if("cola".equals(name)){
            return new ColaDrink();
        }else if ("sprite".equals(name)){
            return new SpriteDrink();
        }else{
            return null;
        }
    }
}
