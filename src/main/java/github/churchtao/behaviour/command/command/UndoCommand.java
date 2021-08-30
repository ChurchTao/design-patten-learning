package github.churchtao.behaviour.command.command;

import github.churchtao.behaviour.command.CommandApp;
import github.churchtao.behaviour.command.editor.Editor;

public class UndoCommand extends Command{
    public UndoCommand(CommandApp app, Editor editor) {
        super(app, editor);
    }

    @Override
    public boolean execute() {
        this.app.undo();
        return false;
    }


}
