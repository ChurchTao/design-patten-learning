package github.churchtao.structor.flyweight.item;

public class TreeType {

    private String name;

    private String color;

    private String texture;

    public TreeType(String name, String color, String texture) {
        this.name = name;
        this.color = color;
        this.texture = texture;
    }

    public void draw(String canvas,int x,int y){
        System.out.println("drawing tree in "+canvas);
        System.out.println("drawing tree : name="+name+";color="+color+";texture"+texture);
        System.out.println("drawing tree : x="+x+";y="+y);
    }
}
