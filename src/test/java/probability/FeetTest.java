package probability;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FeetTest {
    @Test
    void shouldCompareLengthInFeet() {
        Feet feet1 = new Feet(1);
        Feet feet2 = new Feet(1);
        assertEquals(feet1, feet2);
    }
}
