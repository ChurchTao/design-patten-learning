package github.churchtao.creator.builder;

import github.churchtao.creator.builder.concret.CarBuilder;
import github.churchtao.creator.builder.concret.ManualBuilder;
import github.churchtao.creator.builder.product.Car;
import github.churchtao.creator.builder.product.Manual;

public class BuilderMain {
    public static void main(String[] args) {
        CarBuilder suvBuilder = new CarBuilder();
        CarBuilder sportBuilder = new CarBuilder();

        ManualBuilder suvManualBuilder = new ManualBuilder();
        ManualBuilder sportManualBuilder = new ManualBuilder();

        Direct.makeSportCar(sportBuilder);
        Direct.makeSportCar(sportManualBuilder);

        Direct.makeSUVCar(suvBuilder);
        Direct.makeSUVCar(suvManualBuilder);

        Car suvCar = suvBuilder.getResult();
        Car sportCar = sportBuilder.getResult();

        Manual suvManual = suvManualBuilder.getResult();
        Manual sportManual = sportManualBuilder.getResult();

        suvCar.run();
        sportCar.run();

    }
}
