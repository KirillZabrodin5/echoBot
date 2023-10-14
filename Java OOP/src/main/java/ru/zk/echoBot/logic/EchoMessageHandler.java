package ru.zk.echoBot.logic;

import ru.zk.echoBot.AnswerWriter;
import ru.zk.echoBot.MessageHandler;
import ru.zk.echoBot.logic.BotRequest;
import ru.zk.echoBot.logic.BotResponse;

public class EchoMessageHandler implements MessageHandler {
    public void handle(BotRequest request, AnswerWriter writer) {
        BotResponse response = new BotResponse(request.getMessage());
        writer.writeAnswer(response);
    }
}
