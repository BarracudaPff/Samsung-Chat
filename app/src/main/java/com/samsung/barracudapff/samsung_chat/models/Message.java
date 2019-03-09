package com.samsung.barracudapff.samsung_chat.models;

public class Message {
    private Long time;
    private String text;
    private String user_from_id;
    private String user_to_id;

    public Message() {
    }

    public Message(Long time, String text, String user_from_id, String user_to_id) {
        this.time = time;
        this.text = text;
        this.user_from_id = user_from_id;
        this.user_to_id = user_to_id;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getUser_from_id() {
        return user_from_id;
    }

    public void setUser_from_id(String user_from_id) {
        this.user_from_id = user_from_id;
    }

    public String getUser_to_id() {
        return user_to_id;
    }

    public void setUser_to_id(String user_to_id) {
        this.user_to_id = user_to_id;
    }
}
