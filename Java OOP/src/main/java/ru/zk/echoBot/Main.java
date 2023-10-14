package ru.zk.echoBot;

import ru.zk.echoBot.console.ConsoleAnswerWriter;
import ru.zk.echoBot.console.ConsoleInputReader;
import ru.zk.echoBot.logic.BotRequest;
import ru.zk.echoBot.logic.EchoMessageHandler;

public class Main {
    public static void main(String[] args) {
        InputReader input = new ConsoleInputReader();
        AnswerWriter answer = new ConsoleAnswerWriter();
        MessageHandler message = new EchoMessageHandler();

        while (true) {
            BotRequest request = input.getUserInput();
            message.handle(request, answer);
        }
    }
}