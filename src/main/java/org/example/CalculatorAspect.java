package org.example;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.logging.Level;
import java.util.logging.Logger;

@Aspect
@Component
public class CalculatorAspect {
    private final Logger log = Logger.getLogger(this.getClass().getName());


    @Pointcut("execution(* org.example.console.CalculationAction.*(..))")
    public void calcPointCut(){
    }

    @Pointcut("@annotation(org.example.annotation.Logging)")
    public void loggingAnnotatedPointCut(){
    }

    @Before("loggingAnnotatedPointCut()")
    public void loggingStart() {
        log.log(Level.INFO, "loggingAnnotatedPointCut - Start");
    }

    @After("loggingAnnotatedPointCut()")
    public void loggingFinish() {
        log.log(Level.INFO, "loggingAnnotatedPointCut - Finish");

    }


    @Before("calcPointCut()")
    public void calLoggingStart() {
        log.log(Level.INFO, "Start");
    }

    @After("calcPointCut()")
    public void calcLoggingFinish() {
        log.log(Level.INFO, "Finish");
    }
}
