package org.example.core;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;

@Slf4j
public class MessageGeneratorImpl implements MessageGenerator {

    @Autowired
    private Game game;

    @PostConstruct
    public void init() {
        log.info("Game = {}", game);
    }

    @Override
    public String getMainMessage() {
        return "Number is between"
                .concat(" ")
                .concat(String.valueOf(game.getSmallest()))
                .concat(" and ")
                .concat(String.valueOf(game.getBiggest()))
                .concat(". Can you guess it ?");
    }

    @Override
    public String getResultMessage() {

        if (game.isGameWon()) {
            return "You guessed it!"
                    .concat("The number was")
                    .concat(" ")
                    .concat(String.valueOf(game.getNumber()));
        } else if (game.isGameLost()) {
            return "You lost!"
                    .concat("The number was")
                    .concat(" ")
                    .concat(String.valueOf(game.getNumber()));
        } else if (game.getRemainingGuesses() == game.getGuessCount()) {
            return "What is your first guess";
        }

        String direction = "lower";
        if (game.getGuess() < game.getNumber()) {
            direction = "higher";
        }

        return direction
                .concat("! You have ")
                .concat(String.valueOf(game.getRemainingGuesses()))
                .concat(" guesses left");
    }
}
