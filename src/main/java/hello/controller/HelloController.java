package hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    public static final String DEFAULT_RETURN_STRING = "Hello World Docker";

    @GetMapping("/")
    public String home() {
        return DEFAULT_RETURN_STRING;
    }

}