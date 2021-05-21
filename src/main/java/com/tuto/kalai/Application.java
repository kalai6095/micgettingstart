package com.tuto.kalai;

import io.micronaut.context.ApplicationContext;
import io.micronaut.runtime.Micronaut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Application {

    private static final Logger logger = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        final ApplicationContext context = Micronaut.run(Application.class, args);
        logger.info("------------------------Application start------------------------");
    }
}
