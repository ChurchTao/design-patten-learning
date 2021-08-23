package github.churchtao.creator.abstractFactory.factory;

import github.churchtao.creator.abstractFactory.GUIFactory;
import github.churchtao.creator.abstractFactory.button.Button;
import github.churchtao.creator.abstractFactory.button.MacButton;
import github.churchtao.creator.abstractFactory.checkbox.CheckBox;
import github.churchtao.creator.abstractFactory.checkbox.MacCheckBox;

public class MacGUIFactory implements GUIFactory {

    public Button createButton() {
        return new MacButton();
    }

    public CheckBox createCheckBox() {
        return new MacCheckBox();
    }

}
