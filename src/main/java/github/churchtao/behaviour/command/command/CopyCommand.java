package github.churchtao.behaviour.command.command;

import github.churchtao.behaviour.command.CommandApp;
import github.churchtao.behaviour.command.editor.Editor;

public class CopyCommand extends Command{
    public CopyCommand(CommandApp app, Editor editor) {
        super(app, editor);
    }

    @Override
    public boolean execute() {
        this.app.setClipBoard(this.editor.getSelection());
        return false;
    }


}
