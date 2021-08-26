package github.churchtao.creator.builder.concret;

import github.churchtao.creator.builder.Builder;
import github.churchtao.creator.builder.engine.Engine;
import github.churchtao.creator.builder.product.Manual;

public class ManualBuilder implements Builder {

    private Manual manual;

    public void reset() {
        this.manual = new Manual();
    }

    public void setSeats(int num) {

    }

    public void setEngine(Engine engine) {

    }

    public void setTripComputer() {

    }

    public void setGPS() {

    }

    public Manual getResult(){
        return this.manual;
    }
}
