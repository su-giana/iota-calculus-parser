package decl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import types.Name;
import util.JsonUtil;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

@Component
public interface Decl {
    List<String> decls = List.of("DeviceDecl", "InputDecl", "OutputDecl", "TimerDecl");

    public static Decl fromJson(String jsonContext) {
        return decls.stream()
                .filter(decl -> JsonUtil.hasKey(jsonContext, decl))
                .map(decl -> {
                    try {
                        Class<?> declaredEvent = Class.forName(decl);
                        return (Decl) declaredEvent
                                .getDeclaredConstructor()
                                .newInstance(JsonUtil.bodyFromJsonByKey(jsonContext, decl));
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
                .orElseThrow(() -> new RuntimeException("[ERROR] Decl : 존재하는 정의식 종류가 아닙니다"));
    }
}
