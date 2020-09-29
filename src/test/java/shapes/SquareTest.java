package shapes;

import org.junit.jupiter.api.Test;
import shapes.Square;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareTest {
    @Test
    void shouldCalculateAreaOfTheSquare() {
        Square square = new Square(2.0);
        assertEquals(4.0, square.area());
    }

    @Test
    void shouldCalculatePerimeterOfTheSquare() {
        Square square = new Square(2.0);
        assertEquals(8.0, square.perimeter());
    }

}
