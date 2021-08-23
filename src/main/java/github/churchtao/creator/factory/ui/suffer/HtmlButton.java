package github.churchtao.creator.factory.ui.suffer;

public class HtmlButton extends Button{
    @Override
    public void render() {
        System.out.println("<button></button>");

    }

    @Override
    public void onClick(String event) {
        System.out.println("html<>"+event);
    }
}
