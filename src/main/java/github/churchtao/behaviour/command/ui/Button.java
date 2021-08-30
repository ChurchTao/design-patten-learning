package github.churchtao.behaviour.command.ui;

import github.churchtao.behaviour.command.command.ClickListener;

public abstract class Button extends Component{

    protected int width;

    protected int height;

    public Button(String id, int x, int y, int width, int height) {
        super(id, x, y);
        this.width = width;
        this.height = height;
    }

    public abstract void setOnClick(ClickListener clickListener);

    public abstract void click();
}
