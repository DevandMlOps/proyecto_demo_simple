package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppTest {
    @Test
    public void testSum() {
        App app = new App();
        int result = app.sum(2, 3);
        assertEquals(5, result);
    }
}

