package github.churchtao.behaviour.observer;

import github.churchtao.behaviour.observer.event.EventTypeEnum;
import github.churchtao.behaviour.observer.event.LoggingEventListener;

public class ObserverMain {
    public static void main(String[] args) {

        Editor editor = new Editor();

        editor.eventManger.subscribe(EventTypeEnum.OPEN,new LoggingEventListener());
        editor.eventManger.subscribe(EventTypeEnum.SAVE,new LoggingEventListener());

        editor.openFile("/Users/church/Desktop/data.txt");
        editor.saveFile("/Users/church/Desktop/data.txt");

    }
}
