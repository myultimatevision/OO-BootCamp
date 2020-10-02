package shapes;

import java.util.Objects;

public class Rectangle {
    private final double sideA;
    private final double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    private double length() {
        return Math.max(this.sideA, this.sideB);
    }

    private double width() {
        return Math.min(this.sideA, this.sideB);
    }

    public double area() {
        return this.sideA * this.sideB;
    }

    public double perimeter() {
        return 2 * (this.sideA + this.sideB);
    }

    public void printRectangle(RectanglePrinter rectanglePrinter) {
        rectanglePrinter.print(this.length(), this.width(), this.area(), this.perimeter());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(rectangle.sideA, sideA) == 0 &&
                Double.compare(rectangle.sideB, sideB) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sideA, sideB);
    }
}
