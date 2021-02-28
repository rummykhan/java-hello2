package org.example.car;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
@Data
public class Car {

    private String name;
    private String model;
    private String make;
    private List<Tyre> tyres;

    private NumberPlate numberPlate;
    private Engine engine;

    public void log() {
        log.info("\r\n Name: {} " +
                        "\r\n Model: {} " +
                        "\r\n Make: {} " +
                        "\r\n Number: {}" +
                        "\r\n Engine: " +
                        "\r\n - Serial #: {} " +
                        "\r\n - Context #: {}" +
                        "\r\n Tyres:" +
                        "\r\n - Count #: {}",
                this.name,
                this.model,
                this.make,
                this.numberPlate.format(),
                this.engine.getSerialNumber(),
                this.engine.getContext(),
                this.tyres.size());
    }
}
