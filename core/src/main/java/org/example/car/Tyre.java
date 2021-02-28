package org.example.car;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Tyre {
    private String name;
    private String year;
    private Integer goodYear;
}
