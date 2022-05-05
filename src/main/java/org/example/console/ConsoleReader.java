package org.example.console;

import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class ConsoleReader {

    public String readString() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public double readDouble() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

}
