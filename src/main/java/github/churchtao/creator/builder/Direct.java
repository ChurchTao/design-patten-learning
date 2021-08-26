package github.churchtao.creator.builder;

import github.churchtao.creator.builder.engine.SUVEngine;
import github.churchtao.creator.builder.engine.SportEngine;

// 相当于给予builder一套预设的配置
public class Direct {

    public static void makeSportCar(Builder builder){
        builder.reset();
        builder.setEngine(new SportEngine());
        builder.setSeats(2);
        builder.setGPS();
        builder.setTripComputer();
    }

    public static void makeSUVCar(Builder builder){
        builder.reset();
        builder.setEngine(new SUVEngine());
        builder.setSeats(4);
        builder.setGPS();
        builder.setTripComputer();
    }
}
