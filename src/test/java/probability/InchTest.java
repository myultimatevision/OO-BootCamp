package probability;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InchTest {
    @Test
    void shouldCompareLengthInInch() {
        Inch inch1 = new Inch(1);
        Inch inch2 = new Inch(1);
        assertEquals(inch1, inch2);
    }

}
