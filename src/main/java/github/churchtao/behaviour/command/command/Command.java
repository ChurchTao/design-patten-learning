package github.churchtao.behaviour.command.command;

import github.churchtao.behaviour.command.CommandApp;
import github.churchtao.behaviour.command.editor.Editor;

public abstract class Command {

    protected final CommandApp app;
    protected final Editor editor;

    protected String backUp;

    public Command(CommandApp app, Editor editor) {
        this.app = app;
        this.editor = editor;
    }

    public abstract boolean execute();

    public void saveBackUp(){
        this.backUp = this.editor.getText();
    }

    public void undo(){
        this.editor.setText(this.backUp);
    }


}
