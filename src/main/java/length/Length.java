package length;

import java.util.Objects;

public class Length {
    private final double value;
    private final Unit unit;

    public Length(double value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    private boolean isEqualTo(Length other) {
        Length length1 = this.unit.toInch(this.value);
        Length length2 = other.unit.toInch(other.value);
        return length1.value==length2.value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Length length = (Length) o;
        return this.isEqualTo(length);
    }

    @Override
    public int hashCode() {
        return Objects.hash(unit.toInch(this.value).value);
    }
}
