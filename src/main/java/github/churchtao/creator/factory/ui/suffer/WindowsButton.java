package github.churchtao.creator.factory.ui.suffer;

public class WindowsButton extends Button{
    @Override
    public void render() {
        System.out.println("window.button");
    }

    @Override
    public void onClick(String event) {
        System.out.println("windows<>"+event);
    }
}
