package code.sagar.service;

import code.sagar.model.Message;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sagar
 */
public class MessageService {

    public List<Message> getAllMessages() {
        Message message1 = new Message(1L, "Hello World!!!", "Sagar");
        Message message2 = new Message(2L, "Hello Jersey!!!", "Sagar");
        List<Message> messageList = new ArrayList<>();
        messageList.add(message1);
        messageList.add(message2);
        return messageList;
    }
}
