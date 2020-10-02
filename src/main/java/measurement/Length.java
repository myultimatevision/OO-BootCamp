package measurement;

import java.util.Objects;

public class Length {
  private final double value;
  private final LengthUnit unit;

  public Length(double value, LengthUnit unit) {
    this.value = value;
    this.unit = unit;
  }

  @Override
  public int hashCode() {
    return Objects.hash(unit.toStandard(this.value));
  }

  @Override
  public boolean equals(Object o) {
    if(this == o) return true;
    if(o == null || getClass() != o.getClass()) return false;
    Length length = (Length) o;
    return this.isEqualTo(length);
  }

  private boolean isEqualTo(Length other) {
    double length1 = this.unit.toStandard(this.value);
    double length2 = other.unit.toStandard(other.value);
    return length1 == length2;
  }

  public Length add(final Length other) {
    double length1 = this.unit.toStandard(this.value);
    double length2 = other.unit.toStandard(other.value);
    return new Length(length1 + length2, LengthUnit.standardUnit());
  }
}
