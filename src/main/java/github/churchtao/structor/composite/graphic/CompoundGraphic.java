package github.churchtao.structor.composite.graphic;

import java.util.ArrayList;
import java.util.List;

public class CompoundGraphic implements Graphic{

    private List<Graphic> children = new ArrayList<>();

    public void add(Graphic graphic){
        children.add(graphic);
    }

    public void remove(Graphic graphic){
        children.remove(graphic);
    }


    @Override
    public void move(int x, int y) {
        this.children.forEach(item->{
            item.move(x,y);
        });
    }

    @Override
    public void draw() {
        this.children.forEach(Graphic::draw);
    }
}
