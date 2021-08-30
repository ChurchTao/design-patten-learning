package github.churchtao.behaviour.command;

import github.churchtao.behaviour.command.command.Command;
import github.churchtao.behaviour.command.command.CommandHistory;
import github.churchtao.behaviour.command.command.CopyCommand;
import github.churchtao.behaviour.command.command.PasteCommand;
import github.churchtao.behaviour.command.editor.Editor;
import github.churchtao.behaviour.command.ui.Button;
import github.churchtao.behaviour.command.ui.MenuButton;

import java.util.ArrayList;
import java.util.List;

public class CommandApp {

    private CommandHistory history;

    private String clipBoard;

    private List<Editor> editors;

    private Editor activeEditor;

    public CommandApp() {
        this.clipBoard = "";
        this.history = new CommandHistory();
        this.editors = new ArrayList<>();
        Editor editor = new Editor("hello world church");
        this.activeEditor = editor;
        editors.add(editor);

        Button menuButton1 = new MenuButton("copy",0,0,100,100);
        menuButton1.setOnClick(()->{
            executeCommand(new CopyCommand(this,this.activeEditor));
        });
        Button menuButton2 = new MenuButton("paste",0,0,100,100);
        menuButton2.setOnClick(()->{
            executeCommand(new PasteCommand(this,this.activeEditor));
        });

        menuButton1.click();
        menuButton2.click();

        System.out.println(this.activeEditor.getText());
    }


    public String getClipBoard() {
        return clipBoard;
    }

    public void setClipBoard(String clipBoard) {
        this.clipBoard = clipBoard;
    }

    public static void main(String[] args) {
        new CommandApp();
    }

    public void undo() {
        Command command = history.pop();
        if (command!=null){
            command.undo();
        }
    }

    public void executeCommand(Command cmd){
        if (cmd!=null){
            if (cmd.execute()){
                history.push(cmd);
            }
        }
    }


}
