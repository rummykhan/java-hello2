package org.example.car;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Slf4j
public class Program {

    private static final String CONFIG_LOCATION = "beans-main.xml";

    public static void __main(String[] args) {
        log.info("In another main");

        // create context (container)
        ConfigurableApplicationContext context
                = new ClassPathXmlApplicationContext(CONFIG_LOCATION);

        // get number generator bean from context (container)
        Car car = context.getBean(Car.class);

        car.log();
    }
}
