package github.churchtao.structor.composite;

import github.churchtao.structor.composite.graphic.Circle;
import github.churchtao.structor.composite.graphic.CompoundGraphic;
import github.churchtao.structor.composite.graphic.Dot;

public class ImageEditor {

    private CompoundGraphic all = new CompoundGraphic();

    public void load(){
        all.add(new Dot(1,2));
        all.add(new Dot(2,4));
        all.add(new Circle(4,1,1));
        all.add(new Circle(4,1,2));
    }

    public static void main(String[] args) {
        ImageEditor imageEditor = new ImageEditor();
        imageEditor.load();
        CompoundGraphic all2 = new CompoundGraphic();
        all2.add(new Dot(11,2));
        all2.add(new Dot(22,4));
        all2.add(new Circle(34,1,1));
        all2.add(new Circle(44,1,2));
        imageEditor.all.add(all2);
        imageEditor.all.move(2,5);

        imageEditor.all.draw();
    }
}
