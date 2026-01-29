package com.grayjourney.algo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    public void testApp() {
        App app = new App();
        assertEquals("Hello Algo!", app.getGreeting());
    }
}
