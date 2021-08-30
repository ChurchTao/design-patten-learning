package github.churchtao.behaviour.command.ui;

import github.churchtao.behaviour.command.command.ClickListener;

public class MenuButton extends Button{

    private ClickListener clickListener;

    public MenuButton(String id, int x, int y, int width, int height) {
        super(id, x, y, width, height);
    }

    @Override
    public void setOnClick(ClickListener clickListener) {
        this.clickListener = clickListener;
    }

    @Override
    public void click() {
        if (this.clickListener!=null){
            clickListener.click();
        }
    }
}
