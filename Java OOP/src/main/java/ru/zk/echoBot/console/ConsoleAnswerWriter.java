package ru.zk.echoBot.console;

import ru.zk.echoBot.AnswerWriter;
import ru.zk.echoBot.logic.BotResponse;

public class ConsoleAnswerWriter implements AnswerWriter {
    @Override
    public void writeAnswer(BotResponse response) {
        System.out.println("Answer: " + response.getMessage());
    }
}