package sum;

import com.sun.jdi.InternalException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SumTest {

    MyList myList;

    @BeforeEach
    public void setup() {
        myList = new MyList();
    }

    @Test
    @DisplayName("Test of the return of the sum of the elements in the list.")
    void testSum() {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3));
        int expected = 6;
        assertEquals(expected, myList.sum(list));
    }

    @Test
    @DisplayName("Test of the return with the empty list.")
    void testSumWithEmptyList() {
        ArrayList<Integer> list = new ArrayList<>();
        int expected = 0;
        assertEquals(expected, myList.sum(list));
    }

    @Test
    @DisplayName("Test of the return with one element in the list.")
    void testSumWithOneElement() {
        ArrayList<Integer> list = new ArrayList<>(List.of(3));
        int expected = 3;
        assertEquals(expected, myList.sum(list));
    }

    @Test
    @DisplayName("Test of the return with multiple elements in the list.")
    void testSumWithMultipleElements() {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        int expected = 45;
        assertEquals(expected, myList.sum(list));
    }

    @Test
    @DisplayName("Test of the return with a null")
    void testSumWithANull() {
        ArrayList<Integer> list = null;
        Exception expected = new InternalException();
        assertEquals(expected, myList.sum(list));
    }
}