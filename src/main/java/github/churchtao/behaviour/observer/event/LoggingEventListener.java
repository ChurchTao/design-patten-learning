package github.churchtao.behaviour.observer.event;

public class LoggingEventListener implements EventListener{
    @Override
    public void update(EventTypeEnum eventType, String fileName) {
        System.out.println(fileName+" is "+eventType.name());
    }
}
