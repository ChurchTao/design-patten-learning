package github.churchtao.structor.flyweight.item;

public class Tree {

    private int x;
    private int y;
    private TreeType type;

    public Tree(int x, int y, TreeType type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public void draw(String canvas){
        this.type.draw(canvas,this.x,this.y);
    }
}
