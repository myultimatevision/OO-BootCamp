package probability;

import java.util.Objects;

public class Feet {
    private final int value;

    public Feet(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Feet feet = (Feet) o;
        return value == feet.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    public Inch inchValue() {
        return new Inch(12 * this.value);
    }
}
