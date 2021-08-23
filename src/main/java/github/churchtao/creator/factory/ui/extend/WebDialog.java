package github.churchtao.creator.factory.ui.extend;

import github.churchtao.creator.factory.component.Dialog;
import github.churchtao.creator.factory.ui.suffer.Button;
import github.churchtao.creator.factory.ui.suffer.HtmlButton;

public class WebDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
