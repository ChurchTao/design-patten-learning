package github.churchtao.creator.builder;

import github.churchtao.creator.builder.engine.Engine;

public interface Builder {

    void reset();

    void setSeats(int num);

    void setEngine(Engine engine);

    void setTripComputer();

    void setGPS();

}
