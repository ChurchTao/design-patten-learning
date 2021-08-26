package github.churchtao.creator.prototype;

public abstract class Shape {

    private int x;

    private int y;

    private String color;

    public Shape() {
    }

    public Shape(Shape source) {
        this.color = source.color;
        this.x = source.x;
        this.y = source.y;
    }

    public abstract Shape cloneThis();

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
