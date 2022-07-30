package com.example.restservice.Greeting;

public class AnotherGreeting {

    private final long id;
    private final String content;

    public AnotherGreeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
