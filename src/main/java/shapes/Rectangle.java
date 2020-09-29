package shapes;

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

    public void printLength(Printer printer) {
        printer.print(this.length());
    }

    public void printRectangle(RectanglePrinter rectanglePrinter) {
        rectanglePrinter.print(this.length(), this.width(), this.area(), this.perimeter());
    }
}
