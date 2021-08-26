package github.churchtao.structor.adapter;

import github.churchtao.structor.adapter.peg.RoundPeg;
import github.churchtao.structor.adapter.peg.SquarePeg;

public class SquarePegAdapter extends RoundPeg {

    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg squarePeg) {
        super(squarePeg.getWidth()*Math.sqrt(2) / 2);
        this.peg=squarePeg;
    }

    @Override
    public double getRadius() {
        return this.peg.getWidth()*Math.sqrt(2) / 2;
    }
}
