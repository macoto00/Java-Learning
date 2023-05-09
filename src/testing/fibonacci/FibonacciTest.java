package fibonacci;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {
    @Test
    void fibonacci() {
        assertEquals(13, Fibonacci.fibonacci(7));
    }
}