//Resource controller
//In Spring's approach to building RESTful web services, HTTP requests are handld by a controller.
//These components are identified by the @RestController annotation and the GreetingController.
//This handles GET requests for /greeting by returning a new instance of the Greeting class

package com.example.restservice.Greeting;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}
