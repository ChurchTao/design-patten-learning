package github.churchtao.creator.builder.product;

import github.churchtao.creator.builder.engine.Engine;

public class Car {

    private Engine engine;


    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void run(){
        this.engine.makePower();
    }
}
