package io.ar.test;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/hello")
public class HelloController {

    @Get(produces = MediaType.APPLICATION_JSON)
    public Greeting index() {
        return Greeting.builder()
                .greeting("Hello World")
                .build();
    }
}
