package org.example.car;

import lombok.Data;

@Data
public class Engine {
    private String serialNumber = null;
    private String context = null;

    public Engine(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setContext(String context){
        this.context = context;
    }
}
