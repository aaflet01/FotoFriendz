package categoricals;

public class Rating {
    private final double minRating;
    private final double maxRating;
    private double value;

    Rating(double value, double minRating, double maxRating) {
        this.minRating = minRating;
        this.maxRating = maxRating;
        setValue(value);
    }

    private void validateValue(double value) {
        if ((value < this.minRating) || (value > this.maxRating)) {
            throw new IllegalArgumentException(String.format("Value outside of acceptable range [%s, %s].", minRating, maxRating));
        }
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        validateValue(value);
        this.value = value;
    }
}
