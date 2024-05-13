package literal;

import expression.Expression;
import util.JsonUtil;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

public interface Literal {
    final static List<String> literals = List.of("BoolLiteral", "ConstantLiteral", "NumberLiteral", "StringLiteral");

    public static Literal fromJson(String jsonContext) {
        return literals.stream()
                .filter(literal-> JsonUtil.hasKey(jsonContext, literal))
                .map(event -> {
                    try {
                        Class<?> declaredEvent = Class.forName(event);
                        return (Literal) declaredEvent
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
                .orElseThrow(() -> new RuntimeException("[ERROR] Literal : 존재하는 리터럴의 종류가 아닙니다"));
    }
}
