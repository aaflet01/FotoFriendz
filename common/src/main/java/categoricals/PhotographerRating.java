package categoricals;

public class PhotographerRating {
    private static final double MIN_RATING = 0;
    private static final double MAX_RATING = 5;
    private double value;

    PhotographerRating(double value) {
        setValue(value);
    }

    private static void validateValue(double value) {
        if ((value < MIN_RATING) || (value > MAX_RATING)) {
            throw new IllegalArgumentException(String.format("Value outside of acceptable range [%s, %s].", MIN_RATING, MAX_RATING));
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
