package github.churchtao.behaviour.command.command;

import github.churchtao.behaviour.command.CommandApp;
import github.churchtao.behaviour.command.editor.Editor;

public class CutCommand extends Command{
    public CutCommand(CommandApp app, Editor editor) {
        super(app, editor);
    }

    @Override
    public boolean execute() {
        this.saveBackUp();
        this.app.setClipBoard(this.editor.getSelection());
        this.editor.deleteSelection();
        return true;
    }


}
