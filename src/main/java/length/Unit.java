package length;

public enum Unit {
    INCH(1.0), FEET(12.0),CM(0.4),MM(0.04);

    private final double inchValue;

    Unit(double inchValue) {
        this.inchValue = inchValue;
    }

    public Length toInch(double value) {
        return new Length(value * this.inchValue, Unit.INCH);
    }
}
