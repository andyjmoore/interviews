package org.example.softeng.interviews.simple_spring_app.model;

/**
 * A simple greeting.
 */
public class Greeting {

    private final long id;
    private final String content;

    public Greeting(final long id, final String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return this.id;
    }

    public String getContent() {
        return this.content;
    }

}