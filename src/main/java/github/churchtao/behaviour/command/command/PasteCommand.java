package github.churchtao.behaviour.command.command;

import github.churchtao.behaviour.command.CommandApp;
import github.churchtao.behaviour.command.editor.Editor;

public class PasteCommand extends Command{
    public PasteCommand(CommandApp app, Editor editor) {
        super(app, editor);
    }

    @Override
    public boolean execute() {
        this.saveBackUp();
        this.editor.replaceSelection(this.app.getClipBoard());
        return true;
    }


}
