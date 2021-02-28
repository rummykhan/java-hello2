package org.example.car;

import org.springframework.stereotype.Component;

@Component
public class NumberPlate {
    public String prefix = "S";
    public long number = 53909;

    public String format(){
        return this.prefix
                .concat(" ")
                .concat(String.valueOf(this.number));
    }
}
