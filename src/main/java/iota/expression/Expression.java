package expression;

import emca.eventHandler.EventHandler;
import util.JsonUtil;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

public interface Expression {
    final static List<String> expressions = List.of("Addition", "Division",
            "Field", "Subtraction", "Division", "Multiplication", "MinusSign",
            "Multiplication", "Negate", "PredicateExpression", "Timer");

    public static Expression fromJson(String jsonContext) {
        return expressions.stream()
                .filter(expression -> JsonUtil.hasKey(jsonContext, expression))
                .map(event -> {
                    try {
                        Class<?> declaredEvent = Class.forName(event);
                        return (Expression) declaredEvent
                                .getDeclaredConstructor()
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
                .orElseThrow(() -> new RuntimeException("[ERROR] Expression : 존재하는 식의 종류가 아닙니다"));
    }
}
