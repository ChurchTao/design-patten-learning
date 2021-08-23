package github.churchtao.creator.abstractFactory.factory;

import github.churchtao.creator.abstractFactory.GUIFactory;
import github.churchtao.creator.abstractFactory.button.Button;
import github.churchtao.creator.abstractFactory.button.WinButton;
import github.churchtao.creator.abstractFactory.checkbox.CheckBox;
import github.churchtao.creator.abstractFactory.checkbox.WinCheckBox;

public class WinGUIFactory implements GUIFactory {

    public Button createButton() {
        return new WinButton();
    }

    public CheckBox createCheckBox() {
        return new WinCheckBox();
    }

}
