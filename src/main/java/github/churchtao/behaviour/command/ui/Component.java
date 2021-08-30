package github.churchtao.behaviour.command.ui;

public abstract class Component {

    protected String id;
    protected int x;
    protected int y;

    public Component(String id, int x, int y) {
        this.id = id;
        this.x = x;
        this.y = y;
    }
}
