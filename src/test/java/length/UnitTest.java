package length;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UnitTest {

    @Test
    void shouldConvertToInch() {
        Length length1 = Unit.CM.toInch(5.0);
        assertEquals(new Length(2.0,Unit.INCH),length1);
        Length length2 = Unit.FEET.toInch(2.0);
        assertEquals(new Length(24.0,Unit.INCH),length2);
        Length length3 = Unit.MM.toInch(20.0);
        assertEquals(new Length(0.8,Unit.INCH),length3);
    }
}