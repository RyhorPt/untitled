package org.example.console;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class ConsoleWriter {

    public void writeString(String str) {
        System.out.println(str);
    }
}
