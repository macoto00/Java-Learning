package apples;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppleTest {

    @Test
    @DisplayName("Comparing String values - expected to return apple.")
    void getApple() {
        Apple apple = new Apple();
        String expected = "apple";
        assertEquals(expected, apple.getApple());
    }
}