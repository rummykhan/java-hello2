package org.example.core.config;

import org.example.core.GuessCount;
import org.example.core.MaxNumber;
import org.example.core.MinNumber;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:config/game.properties")
public class GameConfig {

    @Value("${game.maxNumber:20}")
    private int maxNumber;

    @Value("${game.guessCount:5}")
    private int guessCount;

    @Value("${game.minNumber:5}")
    private int minNumber;

    @Bean
    @MaxNumber
    public int getMaxNumber() {
        return this.maxNumber;
    }

    @Bean
    @GuessCount
    public int getGuessCount() {
        return this.guessCount;
    }

    @Bean
    @MinNumber
    public int getMinNumber(){
        return this.minNumber;
    }
}
