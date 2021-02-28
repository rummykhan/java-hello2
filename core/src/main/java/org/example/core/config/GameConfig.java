package org.example.core.config;

import org.example.core.GuessCount;
import org.example.core.MaxNumber;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GameConfig {

    private int maxNumber = 25;

    private int guessCount = 8;

    @Bean
    @MaxNumber
    public int getMaxNumber() {
        return this.maxNumber;
    }

    @Bean
    @GuessCount
    public int getGuessCount(){
        return this.guessCount;
    }
}
