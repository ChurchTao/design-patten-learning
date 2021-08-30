package github.churchtao.behaviour.chain;

import github.churchtao.behaviour.chain.component.Button;
import github.churchtao.behaviour.chain.component.Dialog;
import github.churchtao.behaviour.chain.component.Panel;

public class ChainMain {
    public static void main(String[] args) {
        Dialog dialog = new Dialog("http://...");
        Panel panel = new Panel("本面板用于...");
        Button ok = new Button();
        ok.setToolTipText("这是一个确认按钮...");
        Button cancel = new Button();
//        cancel.setToolTipText("这是一个确认按钮...");
        panel.add(ok);
        panel.add(cancel);
        dialog.add(panel);

        dialog.showHelp();
        panel.showHelp();
        ok.showHelp();
        cancel.showHelp();

    }
}
