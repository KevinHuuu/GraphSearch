package edu.berkeley.aep;

public class ScaledQuantity implements Bestable {
    protected final int size;
    protected final Unit units;

    public ScaledQuantity(int size, Unit units) {
        this.size = size;
        this.units = units;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(size);
    }

    @Override
    public String toString() {
        return size + " " + units;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (!(other instanceof ScaledQuantity)) return false;
        return equals((ScaledQuantity) other);
    }

    public boolean equals(ScaledQuantity other) {
        try {
            return this.size == other.convertTo(units);
        } catch (RuntimeException e) {
            return false;
        }
    }

    @Override
    public boolean betterThan(Bestable myBest) {
        ScaledQuantity other = (ScaledQuantity) myBest;
        return size > other.convertTo((units));
    }

    protected int convertTo(Unit toUnits) {
        try {
            return units.convertTo(toUnits, size);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


}
