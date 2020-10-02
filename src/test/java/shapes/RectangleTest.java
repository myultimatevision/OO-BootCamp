package shapes;

import org.junit.jupiter.api.Test;

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
    void shouldPrintDetailOfTheRectangle() {
        Rectangle rectangle = new Rectangle(3.0, 2.0);

        rectangle.printRectangle((length, width, area, perimeter) -> {
            assertEquals(3.0, length);
            assertEquals(2.0, width);
            assertEquals(6.0, area);
            assertEquals(10.0, perimeter);
        });
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
