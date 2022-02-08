package com.company.enesdeniz.model;

import java.util.Date;

public class Message {
    String title;
    String contents;
    Date sendDate;
    Date readDate;
    boolean isSeen;
    User sender;
    User receiver;

    public Message(String title) {
        super();
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
