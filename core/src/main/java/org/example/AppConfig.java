package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.example")
public class AppConfig {

    @Bean
    public NumberGenerator numberGenerator() {
        return new NumberGeneratorImpl();
    }

    @Bean
    public Game game() {
        return new GameImpl();
    }
}
