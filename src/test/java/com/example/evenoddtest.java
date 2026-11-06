package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class evenoddtest {

    @Test
    public void testEven() {
        assertTrue(evenodd.isEven(10));
    }

    @Test
    public void testOdd() {
        assertFalse(evenodd.isEven(7));
    }

    @Test
    public void testZero() {
        assertTrue(evenodd.isEven(0));
    }
}