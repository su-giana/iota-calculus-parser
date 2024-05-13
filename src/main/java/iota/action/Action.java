package action;

import emca.predicate.Predicate;
import util.JsonUtil;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

public interface Action {
    List<String> actions = List.of("CommandAction", "MapAction", "OutputAction", "StartTimer", "StopTimer", "TickTimer");

    public static Action fromJson(String jsonContext) {
        return actions.stream()
                .filter(action -> JsonUtil.hasKey(jsonContext, action))
                .map(action -> {
                    try {
                        Class<?> declaredEvent = Class.forName(action);
                        return (Action) declaredEvent
                                .getDeclaredConstructor()
                                .newInstance(JsonUtil.bodyFromJsonByKey(jsonContext, action));
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
                .orElseThrow(() -> new RuntimeException("[ERROR] Expression : 존재하는 판단식의 종류가 아닙니다"));
    }
}
