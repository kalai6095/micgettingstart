package com.tuto.kalai.controller;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller("${hello.controller.apppath}")
public class HelloworldController {

    private static final Logger logger = LoggerFactory.getLogger(HelloworldController.class);

    @Get("/${hello.controller.path}")
    public String helloworldController() {
        logger.info("-------------------------------------Hello world Controller-----------------------------------------");
        return "Hello World";
    }


}
