package iota.action;

import iota.expression.Expression;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import iota.types.Name;
import iota.util.JsonUtil;

import java.util.List;

@Component
@RequiredArgsConstructor
public class OutputAction implements Action {
    private String outputActionName;
    private List<Expression> expressions;

    public OutputAction(String jsonContext) {
        List<String> outputActionInfo = JsonUtil.processJsonList(jsonContext);

        this.outputActionName = outputActionInfo.get(0);
        this.expressions = JsonUtil.processJsonList(outputActionInfo.get(1)).stream()
                .map(exp -> Expression.fromJson(exp))
                .toList();
    }

    @Override
    public void print() {
        System.out.println(outputActionName);
        expressions.stream()
                .forEach(exp -> exp.print());
    }
}
