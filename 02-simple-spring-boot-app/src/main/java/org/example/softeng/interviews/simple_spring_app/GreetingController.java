package org.example.softeng.interviews.simple_spring_app;

import java.util.concurrent.atomic.AtomicLong;

import org.example.softeng.interviews.simple_spring_app.model.Greeting;
import org.example.softeng.interviews.simple_spring_app.model.SigningResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * The Greeting web service controller.
 */
@RestController
public class GreetingController {

    private static final String GREETING_TEMPLATE = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping(path = "/greeting", produces = MediaType.APPLICATION_JSON_VALUE)
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") final String name) {
        return new Greeting(this.counter.incrementAndGet(), String.format(GreetingController.GREETING_TEMPLATE, name));
    }

    @PostMapping("/guestbook/entry")
    @ResponseStatus(HttpStatus.CREATED)
    public SigningResponse signGuestBook(@RequestParam(value = "name", defaultValue = "World") final String name) {
        // TODO - maybe we store this entry somewhere
        return new SigningResponse();
    }
}