package iota.emca.predicate;

import iota.expression.Expression;
import org.springframework.stereotype.Component;

@Component
public class GreaterThan implements Predicate {
     private Predicate predicate;
     private Expression expression;

     @Override
     public void print() {
          predicate.print();
          expression.print();
     }
}
