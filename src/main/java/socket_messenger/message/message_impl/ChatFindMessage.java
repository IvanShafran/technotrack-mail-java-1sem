package main.java.socket_messenger.message.message_impl;

import main.java.socket_messenger.commands.CommandType;

/**
 * Created by Ivan Shafran on 08.11.2015.
 * Mail: vanobox07@mail.ru
 */
public class ChatFindMessage extends UserMessage {
    private Long chatId;
    private String regex;

    public ChatFindMessage(Long chatId, String regex) {
        super(CommandType.CHAT_FIND);
        this.chatId = chatId;
        this.regex = regex;
    }

    public Long getChatId() {
        return chatId;
    }

    public void setChatId(Long chatId) {
        this.chatId = chatId;
    }

    public String getRegex() {
        return regex;
    }

    public void setRegex(String regex) {
        this.regex = regex;
    }
}