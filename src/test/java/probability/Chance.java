package probability;

public class Chance {
    private final double probabilityValue;

    public Chance(double probabilityValue) {
        this.probabilityValue = probabilityValue;
    }

    public Chance complement() {
        return new Chance(1 - this.probabilityValue);
    }

    public Chance and(Chance other) {
        return new Chance(this.probabilityValue * other.probabilityValue);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Chance chance = (Chance) o;
        return Double.compare(chance.probabilityValue, probabilityValue) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(probabilityValue);
        return (int) (temp ^ (temp >>> 32));
    }

    public Chance or() {
        Chance complementChance = this.complement();
        return complementChance.and(complementChance).complement();
    }
}
