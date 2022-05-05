package org.example;

import org.example.console.CalculationAction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        ApplicationContext ap = new AnnotationConfigApplicationContext(RootConfig.class);
        CalculationAction calculationAction = ap.getBean("calculationAction", CalculationAction.class);
        calculationAction.run();

    }
}
