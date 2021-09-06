package github.churchtao.behaviour.observer.event;

public interface EventListener {

    void update(EventTypeEnum eventType, String fileName);
}
