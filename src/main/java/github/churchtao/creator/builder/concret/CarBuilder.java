package github.churchtao.creator.builder.concret;

import github.churchtao.creator.builder.Builder;
import github.churchtao.creator.builder.engine.Engine;
import github.churchtao.creator.builder.product.Car;

public class CarBuilder implements Builder {

    private Car car;

    public void reset() {
        this.car = new Car();
    }

    public void setSeats(int num) {

    }

    public void setEngine(Engine engine) {
        this.car.setEngine(engine);
    }

    public void setTripComputer() {

    }

    public void setGPS() {

    }

    public Car getResult(){
        return this.car;
    }
}
