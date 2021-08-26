package github.churchtao.creator.prototype;

import github.churchtao.creator.prototype.shapes.Circle;
import github.churchtao.creator.prototype.shapes.Rectangle;

import java.util.ArrayList;
import java.util.List;

public class PrototypeMain {

    private static List<Shape> shapes = new ArrayList<Shape>();
    private static List<Shape> shapesCopy = new ArrayList<Shape>();

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setX(1);
        circle.setY(2);
        circle.setRadius(10);
        circle.setColor("#FFFFFF");
        Rectangle rectangle = new Rectangle();
        rectangle.setX(2);
        rectangle.setY(213);
        rectangle.setHeight(10);
        rectangle.setWidth(100);
        rectangle.setColor("#FFFFFF");
        shapes.add(circle);
        shapes.add(rectangle);
        for (Shape shape : shapes) {
            shapesCopy.add(shape.cloneThis());
        }
        System.out.println(shapesCopy.size());
    }
}
