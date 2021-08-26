package github.churchtao.creator.prototype.shapes;

import github.churchtao.creator.prototype.Shape;

public class Rectangle extends Shape {

    private int width;

    private int height;

    @Override
    public Rectangle cloneThis() {
        return new Rectangle(this);
    }
    public Rectangle() {
    }
    public Rectangle(Rectangle source) {
        super(source);
        this.width = source.width;
        this.height = source.height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }


}
