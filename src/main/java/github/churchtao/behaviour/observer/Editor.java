package github.churchtao.behaviour.observer;

import github.churchtao.behaviour.observer.event.EventManger;
import github.churchtao.behaviour.observer.event.EventTypeEnum;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Editor {

    private File file;

    public EventManger eventManger;

    public Editor() {
        this.eventManger = new EventManger();
    }

    public void openFile(String path){
        this.file = new File(path);
        eventManger.notifyEvent(EventTypeEnum.OPEN,file.getName());
    }

    public void saveFile(String path){
        try {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write("123");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        eventManger.notifyEvent(EventTypeEnum.SAVE,file.getName());
    }


}
