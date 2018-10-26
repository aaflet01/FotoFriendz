package filter.dto;

public class MeetingLocationFilterDTO {
    private double longitude; //TODO should these be changed to a coordinate (to match with other DTOs)?
    private double latitude;
    private double radius;

    MeetingLocationFilterDTO(double longitude, double latitude, double radius) {
        this.longitude = longitude;
        this.latitude = latitude;
        this.radius = radius;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}
