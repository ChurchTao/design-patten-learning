package github.churchtao.creator.prototype.shapes;

import github.churchtao.creator.prototype.Shape;

public class Circle extends Shape {

    // 半径
    private int radius;

    @Override
    public Circle cloneThis() {
        return new Circle(this);
    }

    public Circle() {
    }

    public Circle(Circle source) {
        super(source);
        this.radius = source.radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
