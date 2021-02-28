package org.example.core;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Random;

public class NumberGeneratorImpl implements NumberGenerator {

    private final Random random = new Random();

    @Autowired
    @MaxNumber
    private int maxNumber;

    @Autowired
    @MinNumber
    private int minNumber;

    @Override
    public int next() {
        if (minNumber > maxNumber || (maxNumber - minNumber + 1 >= Integer.MAX_VALUE)) {
            throw new IllegalArgumentException("Invalid range");
        }

        return random.nextInt(maxNumber - minNumber + 1) + minNumber;
    }

    @Override
    public int getMaxNumber() {
        return maxNumber;
    }

    public int getMinNumber() {
        return minNumber;
    }
}
