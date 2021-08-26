package github.churchtao.structor.adapter;

import github.churchtao.structor.adapter.peg.RoundPeg;

public class RoundHole {

    private double radius;

    public RoundHole(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public boolean fits(RoundPeg roundPeg){
        if (this.radius >= roundPeg.getRadius()){
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }
}
