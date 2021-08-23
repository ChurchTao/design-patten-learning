package github.churchtao.creator.abstractFactory;

import github.churchtao.creator.abstractFactory.button.Button;
import github.churchtao.creator.abstractFactory.checkbox.CheckBox;

public interface GUIFactory {

    Button createButton();

    CheckBox createCheckBox();

}
