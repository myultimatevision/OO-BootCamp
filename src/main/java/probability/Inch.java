package probability;

import java.util.Objects;

public class Inch {
    private final int value;

    public Inch(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Inch inch = (Inch) o;
        return value == inch.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
