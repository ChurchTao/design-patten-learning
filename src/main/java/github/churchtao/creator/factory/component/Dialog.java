package github.churchtao.creator.factory.component;

import github.churchtao.creator.factory.ui.suffer.Button;

public abstract class Dialog{


    public abstract Button createButton();

    public void render() {
        Button okButton = createButton();
        okButton.onClick("closeDialog");
        okButton.render();
    }
}
