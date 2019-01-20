package categoricals;

public class PhotographerRating extends Rating {
    private static final double MIN_RATING = 0;
    private static final double MAX_RATING = 5;

    PhotographerRating(double value) {
        super(value, MIN_RATING, MAX_RATING);
    }
}
