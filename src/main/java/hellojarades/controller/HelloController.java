package hellojarades.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    private static final Logger LOGGER = LoggerFactory.getLogger(HelloController.class);

    @Value("${TARGET:From GPC}")
    String target;

    @GetMapping("/")
    public String home() {
        LOGGER.info("hit targuet!");
        return "Hello " + target + "!";
    }

}