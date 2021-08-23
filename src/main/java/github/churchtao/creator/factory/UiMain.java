package github.churchtao.creator.factory;

import github.churchtao.creator.factory.component.Dialog;
import github.churchtao.creator.factory.ui.extend.WebDialog;
import github.churchtao.creator.factory.ui.extend.WindowsDialog;

public class UiMain {
    public static void main(String[] args) {
        Dialog dialog = new WebDialog();
        dialog.createButton();
        dialog.render();
        Dialog dialog2 = new WindowsDialog();
        dialog2.createButton();
        dialog2.render();
    }
}
