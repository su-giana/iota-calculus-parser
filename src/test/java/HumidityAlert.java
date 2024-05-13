//import iota.action.CommandAction;
//import iota.action.OutputAction;
//import iota.decl.DeviceDecl;
//import iota.decl.InputDecl;
//import iota.decl.OutputDecl;
//import iota.emca.Emca;
//import iota.emca.eventHandler.EventHandler;
//import iota.emca.eventHandler.EventTo;
//import iota.emca.predicate.ExpressionPredicate;
//import iota.emca.predicate.GreaterThanOrEqualTo;
//import iota.emca.predicate.LessThan;
//import iota.emca.predicate.Predicate;
//import iota.expression.Field;
//import iota.expression.LiteralExpression;
//import iota.literal.ConstantLiteral;
//import iota.rule.LeafRule;
//import iota.types.*;
//import types.*;
//
//import java.util.List;
//
//public class HumidityAlert {
////    rule "humidity-alert.groovy"
////
////    device humiditySensor1 : relativeHumidityMeasurement;
////    input tooHumid : number;
////    input tooDry : number;
////    device switch1 : switch;
////    output send : string;
////
////    humiditySensor1.humidity [ .~>currentHumidity ];
////
////    currntyHumidity >= tooHumid;
////    send ( "Sensed high humidity level: " + currentHumidity ),
////    switch1.switch := on
////
////  | currntyHumidity < tooDry;
////    send ( "Sensed low humidity level: " + currentHumidity ),
////    switch1.switch := off
////
////            end
//
//    public HumidityAlert( ) {
//        new LeafRule(
//                new Description("humidity-alert.groovy"),
//                initDecls(),
//                initEcma()
//        );
//    }
//
//    private Decls initDecls( ) {
//        // humiditySensor1
//        DeviceDecl humiditySensor = new DeviceDecl(
//                new Name("humiditySensor"),
//                List.of(new Capability("relativeHumidityMeasurement"
//                )));
//        // tooHumid
//        InputDecl tooHumid = new InputDecl(new Name("tooHumid"), new ValueType("number"));
//        InputDecl tooDry = new InputDecl(new Name("tooDry"), new ValueType("number"));
//        DeviceDecl switch1 = new DeviceDecl(new Name("switch1"), List.of(new Capability("switch")));
//        OutputDecl send = new OutputDecl(new Name("send"), List.of(new ValueType("string")));
//        return new Decls(List.of(
//                humiditySensor, tooHumid, tooDry, switch1, send
//        ));
//    }
//
//    private Emca initEcma( ) {
//        return new Emca(
//                initEvent(),
//                initConditionActions()
//        );
//    }
//
//    private EventHandler initEvent( ) {
//        DeviceName deviceName = new DeviceName(new Name("humiditySensor"));
//        AttributeName attributeName = new AttributeName(new Name("humidity"));
//        FieldOrTimerSubject subject = new FieldOrTimerSubject(new Field(deviceName, attributeName));
//
//        EventConstant eventConstant = new EventConstant(new ConstantLiteral("currentHumidity"));
//        return new EventTo(subject, eventConstant);
//    }
//
//    private MultiplePredicateActions initConditionActions( ) {
//        return new MultiplePredicateActions(
//                List.of(
//                        initTooHumidPredicateAction(),
//                        initTooDryPredicateAction()
//                )
//        );
//    }
//
//    private PredicateAction initTooHumidPredicateAction( ) {
//        Predicate predicate = new GreaterThanOrEqualTo(
//                new ExpressionPredicate(new LiteralExpression(new ConstantLiteral("currentHumidity"))),
//                new LiteralExpression(new ConstantLiteral("tooHumid"))
//        );
//        Actions actions = new Actions(
//                List.of(
//                        new OutputAction(
//                                new Name( "Sensed high humidity level: "),
//                                List.of()
//                        ),
//                        new CommandAction(
//                                new FieldOrTimerSubject(new Field(new DeviceName(new Name("switch")), new AttributeName(new Name("switch")))),
//                                new LiteralExpression(new ConstantLiteral("on"))
//                        )
//                )
//        );
//
//        return new PredicateAction(predicate, actions);
//    }
//
//    private PredicateAction initTooDryPredicateAction( ) {
//        Predicate predicate = new LessThan(
//                new ExpressionPredicate(new LiteralExpression(new ConstantLiteral("currentHumidity"))),
//                new LiteralExpression(new ConstantLiteral("tooDry"))
//        );
//        Actions actions = new Actions(
//                List.of(
//                        new OutputAction(
//                                new Name( "Sensed low humidity level: "),
//                                List.of()
//                        ),
//                        new CommandAction(
//                                new FieldOrTimerSubject(new Field(new DeviceName(new Name("switch")), new AttributeName(new Name("switch")))),
//                                new LiteralExpression(new ConstantLiteral("off"))
//                        )
//                )
//        );
//
//        return new PredicateAction(predicate, actions);
//    }
//}