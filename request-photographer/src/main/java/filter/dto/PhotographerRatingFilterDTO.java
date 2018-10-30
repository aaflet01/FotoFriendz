package filter.dto;

import categoricals.PhotographerRating;

public class PhotographerRatingFilterDTO implements FilterDTO {
    private PhotographerRating rating;
    PhotographerRatingFilterDTO(PhotographerRating rating) {
        setRating(rating);
    }

    public PhotographerRating getRating() {
        return rating;
    }

    public void setRating(PhotographerRating rating) {
        this.rating = rating;
    }
}
