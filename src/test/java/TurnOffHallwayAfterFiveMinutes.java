import action.Action;
import action.CommandAction;
import action.OutputAction;
import action.StartTimer;
import action.TickTimer;
import decl.DeviceDecl;
import decl.InputDecl;
import decl.OutputDecl;
import decl.TimerDecl;
import emca.Emca;
import emca.eventHandler.EventFrom;
import emca.eventHandler.EventHandler;
import emca.eventHandler.EventTo;
import emca.eventHandler.JustEvent;
import emca.predicate.ExpressionPredicate;
import emca.predicate.GreaterThanOrEqualTo;
import emca.predicate.IsEqual;
import emca.predicate.LessThan;
import emca.predicate.Predicate;
import expression.Field;
import expression.LiteralExpression;
import expression.PredicateExpression;
import expression.Timer;
import literal.ConstantLiteral;
import literal.Literal;
import literal.NumberLiteral;
import rule.LeafRule;
import rule.NodeRule;
import rule.Rule;
import types.*;

import java.util.List;

public class TurnOffHallway {
    /* rules "Turn off the hallway light five minutes after the door locks"
    device front_door : lock;
    device hallway_light : switch ;
    timer light_timer;

    rule "start a timer when the door gets locked."

        front_door.lock [ unlocked ~> ] ;    // event handler
        front_door.lock == locked ;        // condition
        start light_timer at 0              // action

    end

    rule "increment the timer."

        light_timer[. ~> ];           // event handler
        light_timer < 5;              // condition
        tick light_timer              // actions

    end

    rule "turn off the the hallway light and stop the timer when the timer reaches five minutes."

        light_timer[. ~> ];           // event handler
        light_timer == 5;              // condition
        hallway_light.switch := off,  // actions
        stop light_timergit

    end

    end*/

    public TurnOffHallway(){
        new NodeRule(
                new Description("turn-off-hallway-light-five-minutes-after-the-front-door-is-locked.groovy"),
                initDecls(),
                initRules()
        );
    }

    private List<LeafRule> initRules(){
        LeafRule StartTimer = new LeafRule(
                new Description("start a timer when the door gets locked."),
                initDecls(),
                new Emca(initEventBehavior(), new MultiplePredicateActions(List.of(initDoorUnlocked())))
        );

        LeafRule IncrementTimer = new LeafRule(
                new Description("increment the timer."),
                initDecls(),
                new Emca(initEventTimer(), new MultiplePredicateActions(List.of(initIncrementTimer())))
        );

        LeafRule SwitchOffAndStopTimer = new LeafRule(
                new Description("turn off the the hallway light and stop the timer when the timer reaches five minutes."),
                initDecls(),
                new Emca(initEventTimer(), new MultiplePredicateActions(List.of(initAfterFiveMinuteTurnOffAndStopTimer())))
        )

        return List.of(StartTimer, IncrementTimer, );
    }

    private Decls initDecls(){
        DeviceDecl FrontDoor = new DeviceDecl(
                new Name("front_door"),
                List.of(new Capability("lock"))
        );
        DeviceDecl HallwayLight = new DeviceDecl(
                new Name("hallway_light"),
                List.of(new Capability("switch"))
        );
        TimerDecl LightTimer = new TimerDecl(new Name("light_timer"));

        return new Decls(List.of(FrontDoor, HallwayLight, LightTimer));
    }

    //첫번째 룰 이벤트 핸들러
    private EventHandler initEventBehavior(){
        FieldOrTimerSubject subject = new FieldOrTimerSubject(
                new Field(
                        new DeviceName(new Name("front_door")),
                        new AttributeName(new Name("lock"))
                )
        );
        EventConstant eventConstant = new EventConstant(new ConstantLiteral("unlocked"));

        return new EventFrom(subject, eventConstant);
        //EventFrom 클래스 EventHandler 상속
    }

    //두번째 룰 이벤트 핸들러
    private EventHandler initEventTimer(){
        FieldOrTimerSubject subject = new FieldOrTimerSubject(
                new Timer(new TimerName(new Name("light_timer")))
        );

        return new JustEvent(subject);
    }

    //첫번째 룰 컨디션, 액션
    private PredicateAction initDoorUnlocked(){
        Predicate predicate = new IsEqual(
                new ExpressionPredicate(new LiteralExpression(new ConstantLiteral("front_door.lock"))),
                new ExpressionPredicate(new LiteralExpression(new ConstantLiteral("locked"))),
                );

        Actions actions = new Actions(
                List.of(
                        new StartTimer(
                                new TimerName(new Name("light_timer")),
                                new Timer(new TimerName(new Name("light_timer")))
                        )
                )
        );

        return new PredicateAction(predicate, actions);
    }

    //두번째 룰 컨디션, 액션
    private PredicateAction initIncrementTimer(){
        Predicate predicate = new LessThan(
                new ExpressionPredicate(new LiteralExpression(new ConstantLiteral("light_timer"))),
                new LiteralExpression(new NumberLiteral(5))
        );

        Actions actions = new Actions(
                List.of(
                        new TickTimer(new TimerName(new Name("light_timer")))
                )
        );

        return new PredicateAction(predicate, actions);
    }

    //세번째 룰 컨디션, 액션
    private PredicateAction initAfterFiveMinuteTurnOffAndStopTimer(){
        Predicate predicate = new IsEqual(
                new ExpressionPredicate(new LiteralExpression(new ConstantLiteral("light_timer"))),
                new ExpressionPredicate(new LiteralExpression(new NumberLiteral(5)))
        );

        Actions actions = new Actions(
                List.of(
                        new TickTimer(new TimerName(new Name("light_timer"))),
                        new CommandAction(
                                new FieldOrTimerSubject(new Field(new DeviceName(new Name("hallway_light")), new AttributeName(new Name("switch")))),
                                new LiteralExpression(new ConstantLiteral("off"))
                        )
                )
        );


        return new PredicateAction(predicate, actions);
    }
}