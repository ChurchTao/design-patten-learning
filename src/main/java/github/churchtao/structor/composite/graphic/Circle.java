package github.churchtao.structor.composite.graphic;

public class Circle extends Dot implements Graphic{

    private int radius;

    public Circle(int x, int y,int radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public void move(int x, int y) {
        super.move(x, y);
    }

    @Override
    public void draw() {
        System.out.println("print circle in "+this.x+","+this.y+" radius="+this.radius);
    }
}
