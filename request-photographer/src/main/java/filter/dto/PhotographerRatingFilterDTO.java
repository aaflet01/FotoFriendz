package filter.dto;

public class PhotographerRatingFilterDTO implements FilterDTO {
    private int rating; //TODO change to enum
    PhotographerRatingFilterDTO(int rating) {
        this.rating = rating;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
