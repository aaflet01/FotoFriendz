package generics;

public enum LinearUnit {
    Meter(1d), Mile(1609.34);

    private double meters;

    LinearUnit(double unitInMeters) {
        this.meters = unitInMeters;
    }

    public double convertToMeters(double length) {
        return length*this.meters;
    }
}
