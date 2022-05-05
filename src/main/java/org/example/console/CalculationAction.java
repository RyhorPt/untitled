package org.example.console;

import org.example.service.CalculationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.logging.Level;
import java.util.logging.Logger;

@Component
public class CalculationAction {

    private final ConsoleWriter writer;
    private final ConsoleReader reader;
    private final CalculationService calcService;

    @Autowired
    public CalculationAction(ConsoleWriter writer, ConsoleReader reader, CalculationService calcService) {
        this.writer = writer;
        this.reader = reader;
        this.calcService = calcService;
    }


    public void run() {
        writer.writeString("Please, enter first number: ");
        double a = reader.readDouble();
        writer.writeString("Please, enter second number: ");
        double b = reader.readDouble();
        writer.writeString("Please, enter operation number: ");
        String operation = reader.readString();
        writer.writeString("Result: " + calcService.calc(a, b, operation));
    }


}
