package filter.dto;

import generics.MapDistance;

import java.awt.geom.Point2D;

public class MeetingLocationFilterDTO {
    private Point2D location;
    private MapDistance radius;

    MeetingLocationFilterDTO(Point2D location, MapDistance radius) {
        this.location = location;
        this.radius = radius;
    }

    public Point2D getLocation() {
        return location;
    }

    public void setLocation(Point2D location) {
        this.location = location;
    }

    public MapDistance getRadius() {
        return radius;
    }

    public void setRadius(MapDistance radius) {
        this.radius = radius;
    }
}
