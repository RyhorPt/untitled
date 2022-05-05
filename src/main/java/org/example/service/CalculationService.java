package org.example.service;

import org.example.annotation.Logging;
import org.springframework.stereotype.Component;

@Component
public class CalculationService {

    @Logging
    public Double calc(double a, double b, String operation) {
        switch (operation) {
            case "sum":
                return a + b;
        }
        return null;
    }

}
