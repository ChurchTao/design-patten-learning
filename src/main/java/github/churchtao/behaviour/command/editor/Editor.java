package github.churchtao.behaviour.command.editor;

public class Editor {

    private String text;

    public String getSelection(){
        return text;
    }

    public void deleteSelection(){
        this.text = text.replace("church","");
    }

    public void replaceSelection(String text){
        this.text = text.replace("church",text);
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Editor(String text) {
        this.text = text;
    }
}
