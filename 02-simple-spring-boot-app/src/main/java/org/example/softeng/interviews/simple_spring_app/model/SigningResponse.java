package org.example.softeng.interviews.simple_spring_app.model;

/**
 * A simple response to signing the guestbook.
 */
public class SigningResponse {

    private final String reply = "Thank you for signing!";

    public SigningResponse() {}

    public String getReply() {
        return this.reply;
    }

}