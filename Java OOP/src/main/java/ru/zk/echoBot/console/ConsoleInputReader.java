package ru.zk.echoBot.console;

import ru.zk.echoBot.InputReader;
import ru.zk.echoBot.logic.BotRequest;

import java.util.Scanner;

public class ConsoleInputReader implements InputReader {
    private Scanner scanner;

    public ConsoleInputReader() {
        this.scanner = new Scanner(System.in);
    }

    public BotRequest getUserInput() {
        System.out.print("Enter your message: ");
        return new BotRequest(scanner.nextLine());
    }
}
