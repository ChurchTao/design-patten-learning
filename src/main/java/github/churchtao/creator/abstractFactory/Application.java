package github.churchtao.creator.abstractFactory;

import github.churchtao.creator.abstractFactory.button.Button;
import github.churchtao.creator.abstractFactory.checkbox.CheckBox;
import github.churchtao.creator.abstractFactory.factory.MacGUIFactory;
import github.churchtao.creator.abstractFactory.factory.WinGUIFactory;

public class Application {

    private Button button;

    private CheckBox checkBox;

    public Application(GUIFactory guiFactory) {
        this.button = guiFactory.createButton();
        this.checkBox = guiFactory.createCheckBox();
    }

    // 绘制
    public void paint(){
        this.button.paint();
        this.checkBox.paint();
    }

    public static void main(String[] args) {
        String os = "Mac";
        Application app;
        if (os.equals("Mac")){
            app = new Application(new MacGUIFactory());
        } else {
            app = new Application(new WinGUIFactory());
        }
        app.paint();
    }
}
