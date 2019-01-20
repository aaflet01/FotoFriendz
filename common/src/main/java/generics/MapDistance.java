package generics;

public class MapDistance {
    private final LinearUnit unit;
    private final double value;

    public MapDistance(double value, LinearUnit unit) {
        this.value = value;
        this.unit = unit;
    }

    public double getValue() {
        return value;
    }

    public LinearUnit getUnit() {
        return unit;
    }

    public double convertToMeters() {
        return unit.convertToMeters(this.value);
    }
}
