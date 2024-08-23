package codingblackfemales.gettingstarted;

import codingblackfemales.action.Action;
import codingblackfemales.action.NoAction;
import codingblackfemales.algo.AlgoLogic;
import codingblackfemales.sotw.SimpleAlgoState;
import codingblackfemales.util.Util;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyAlgoLogic implements AlgoLogic {

    // Create an instance of logger
    private static final Logger logger = LoggerFactory.getLogger(MyAlgoLogic.class);

    // I assume this is the concrete class SimpleAlgoStateImpl that object is being made from.
    @Override
    public Action evaluate(SimpleAlgoState state) {

        var orderBookAsString = Util.orderBookToString(state);
    // info method stating: Normal but not too verbose
        logger.info("[MYALGO] The state of the order book is:\n" + orderBookAsString);

        /********
         *
         * Add your logic here....
         *
         */

        return NoAction.NoAction;
    }
}

/*
### slf4J - Simple Logging Facade for Java ###
What is it? set of Interface and Abstractions that aim to consolidate and standardize logging in the JVM environment, while allowing decoupling
Why use it? : Used to debug issues relating to class loading when handling external libraries
1) Dependency for slf4J API pre-existed with forked repo
2) Need to create an instance of the logger : LN14

### Benefit of Logging ###
- Logging has the concept of levels : OFF, FATAL, ERROR, WARN, INFO (shown in file), DEBUG, TRACE, ALL
- Can send output to multiple places compared to System.out.println()
 */



