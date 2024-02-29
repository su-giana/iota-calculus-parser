package action;

import expression.Expression;
import lombok.AllArgsConstructor;
import types.Name;

import java.util.List;

@AllArgsConstructor
public class OutputAction extends Action {
    private final Name outputActionName;
    private final List<Expression> expressions;
}
