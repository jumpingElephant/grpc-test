package io.ar.test;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Greeting {
    private String greeting;
}
