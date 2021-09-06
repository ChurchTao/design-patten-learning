package github.churchtao.behaviour.observer.event;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventManger {

    private Map<EventTypeEnum,List<EventListener>> listeners = new HashMap<>();

    public void subscribe(EventTypeEnum eventType,EventListener eventListener){
        listeners.computeIfAbsent(eventType, k -> new ArrayList<EventListener>());
        listeners.get(eventType).add(eventListener);
    }

    public void unsubscribe(EventTypeEnum eventType,EventListener eventListener){
        if (listeners.get(eventType)!=null){
            listeners.get(eventType).remove(eventListener);
        }
    }

    public void notifyEvent(EventTypeEnum eventType,String data){
        if (listeners.get(eventType)!=null){
            listeners.get(eventType).forEach(item->item.update(eventType,data));
        }
    }
}
