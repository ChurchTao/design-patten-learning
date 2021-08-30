package github.churchtao.behaviour.command.command;

import java.util.Stack;

public class CommandHistory {

    private Stack<Command> history = new Stack<>();

    public void push(Command command){
        this.history.push(command);
    }

    public Command pop(){
        return this.history.pop();
    }
}
