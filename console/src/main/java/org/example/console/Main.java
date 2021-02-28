package org.example.console;

import lombok.extern.slf4j.Slf4j;
import org.example.core.AppConfig;
import org.example.core.MessageGenerator;
import org.example.core.NumberGenerator;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Slf4j
public class Main {

    public static void main(String[] args) {
        log.info("Guess The Number Game");

        // create context (container)
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // get number generator bean from context (container)
        NumberGenerator numberGenerator
                = context.getBean("numberGenerator", NumberGenerator.class);

        // call method next() to get a random number
        int number = numberGenerator.next();

        // log generated number
        log.info("number = {}", number);

        // get message generator bean from context (container)
        MessageGenerator messageGenerator = context.getBean(MessageGenerator.class);

        log.info("getMainMessage = {}", messageGenerator.getMainMessage());

        // close context (container)
        context.close();
    }
}
