package shapes;

import org.junit.jupiter.api.Test;
import shapes.Rectangle;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleTest {
    @Test
    void shouldCalculateTheAreaOfTheRectangle() {
        Rectangle rectangle = new Rectangle(3.0, 2.0);
        assertEquals(6.0, rectangle.area());
    }

    @Test
    void shouldCalculateThePerimeterOfTheRectangle() {
        Rectangle rectangle = new Rectangle(2.0, 1.0);
        assertEquals(6.0, rectangle.perimeter());
    }

    @Test
    void shouldPrintLengthOfTheRectangle() {
        Rectangle rectangle = new Rectangle(2.0, 1.0);
        rectangle.printLength((length) -> assertEquals(2.0, length));
    }

}
