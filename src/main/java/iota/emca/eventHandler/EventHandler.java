package iota.emca.eventHandler;


import iota.util.JsonUtil;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

public interface EventHandler {
    String prefix = "iota.emca.eventHandler.";
    final static List<String> events = List.of("EventFrom", "EventFromTo", "EventTo", "GroupEvent", "JustEvent");

    public static EventHandler fromJson(String jsonContext) {
        return events.stream()
                .filter(event -> JsonUtil.hasKey(jsonContext, event))
                .map(event -> {
                    try {
                        Class<?> declaredEvent = Class.forName(prefix + event);
                        return (EventHandler) declaredEvent
                                .getDeclaredConstructor(String.class)
                                .newInstance(JsonUtil.bodyFromJsonByKey(jsonContext, event));
                    } catch (ClassNotFoundException e) {
                        throw new RuntimeException(e);
                    } catch (InvocationTargetException e) {
                        throw new RuntimeException(e);
                    } catch (InstantiationException e) {
                        throw new RuntimeException(e);
                    } catch (IllegalAccessException e) {
                        throw new RuntimeException(e);
                    } catch (NoSuchMethodException e) {
                        throw new RuntimeException(e);
                    }
                })
                .findAny()
                .orElseThrow(() -> new RuntimeException("[ERROR] EventHandler : 존재하는 이벤트의 종류가 아닙니다"));
    }
    public void print();
}
