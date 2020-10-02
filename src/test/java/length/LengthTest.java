package length;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LengthTest {
    @Test
    void shouldCompareTwoEqualFeetAndInch() {
        Length length1 = new Length(1, Unit.FEET);
        Length length2 = new Length(12, Unit.INCH);
        assertTrue(length1.equals(length2));
    }

    @Test
    void shouldNotCompareTwoDifferentFeetAndInch() {
        Length length1 = new Length(1, Unit.FEET);
        Length length2 = new Length(11, Unit.INCH);
        assertFalse(length1.equals(length2));
    }
}
