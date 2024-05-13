package action;

import expression.Expression;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import types.Name;
import util.JsonUtil;

import java.util.List;

@Component
public class OutputAction implements Action {
    private Name outputActionName;
    private List<Expression> expressions;

    public OutputAction(String jsonContext) {
        List<String> outputActionInfo = JsonUtil.processJsonList(jsonContext);

        this.outputActionName = new Name(outputActionInfo.get(0));
        this.expressions = JsonUtil.processJsonList(outputActionInfo.get(1)).stream()
                .map(exp -> Expression.fromJson(exp))
                .toList();
    }
}
