package com.avdotchenkov.client.history;


import com.avdotchenkov.client.TextMessage;

import java.util.List;

public interface ChatHistory {

    void addMessage(TextMessage message);

    List<TextMessage> getLastMessages(int count);

    void flush();
}
