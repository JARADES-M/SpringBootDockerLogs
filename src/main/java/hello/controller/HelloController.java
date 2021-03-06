package hello.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    private static final Logger LOGGER = LoggerFactory.getLogger(HelloController.class);

    public static final String DEFAULT_RETURN_STRING = "My Hello World Docker";

    @GetMapping("/")
    public String home() {
        LOGGER.info("home called!");
        return DEFAULT_RETURN_STRING;
    }

}