package emca.predicate;

import expression.Expression;
import util.JsonUtil;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

public interface Predicate {
    List<String> predicates = List.of("Exists", "Forall",
            "ExpressionPredicate", "GreaterThan", "GreaterThanOrEqualTo", "isEqual", "IsInequal",
            "LessThan", "LessThanOrEqualTo", "LogicalAnd", "LogicalOr");

    public static Predicate fromJson(String jsonContext) {
        return predicates.stream()
                .filter(predicate-> JsonUtil.hasKey(jsonContext, predicate))
                .map(predicate -> {
                    try {
                        Class<?> declaredEvent = Class.forName(predicate);
                        return (Predicate) declaredEvent
                                .getDeclaredConstructor()
                                .newInstance(JsonUtil.bodyFromJsonByKey(jsonContext, predicate));
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
