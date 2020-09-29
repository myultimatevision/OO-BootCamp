package com.rectangle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleTest {
    @Test
    void shouldCalculateTheAreaOfTheRectangleForPositiveDimensions(){
        Rectangle rectangle = new Rectangle(2.0, 1.0);
        assertEquals(2.0,rectangle.area());
    }

    @Test
    void shouldCalculateThePerimeterOfTheRectangleForPositiveDimensions(){
        Rectangle rectangle = new Rectangle(2.0, 1.0);
        assertEquals(6.0,rectangle.perimeter());
    }
}
