package org.junit.example;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

import static org.junit.jupiter.api.condition.JRE.*;

public class CondicionaisTeste {

    @Test
    //@EnabledIfEnvironmentVariable(named = "USER", matches = "cesar")
    @EnabledOnJre(JAVA_22)
    public void validarAlgoSomenteNoUsuarioCesar() {
        Assumptions.assumeFalse("cesar".equals(System.getenv("USER")));
        Assertions.assertEquals(10, 5 + 5);
    }
}
