package github.churchtao.structor.adapter;

import github.churchtao.structor.adapter.peg.RoundPeg;
import github.churchtao.structor.adapter.peg.SquarePeg;

public class AdapterMain {

    public static void main(String[] args) {
        RoundPeg roundPeg = new RoundPeg(1);
        SquarePeg squarePeg = new SquarePeg(Math.sqrt(1.99));

        RoundPeg squarePegAdapter = new SquarePegAdapter(squarePeg);

        System.out.println(roundPeg.getRadius());
        System.out.println(squarePegAdapter.getRadius());

        RoundHole roundHole = new RoundHole(1);
        roundHole.fits(roundPeg);
        roundHole.fits(squarePegAdapter);
    }
}
