package users;

import java.awt.geom.Point2D;
import java.util.Set;
import java.util.UUID;

public class User {

    private final UUID userId;
    private String email;
    private Point2D location;
    private String name;
    private String payId; //TODO probably switch to some other object
    private Set<String> appDevices;

    public User(final UUID userId, final String name, final String email, final Point2D location, final String payId,
                final Set<String> appDevices) {
        this.userId = userId;
        this.email = email;
        this.location = location;
        this.name = name;
        this.payId = payId;
        this.appDevices = appDevices;
    }

    public UUID getUserId() {
        return userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Point2D getLocation() {
        return location;
    }

    public void setLocation(Point2D location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPayId(String payId) {
        this.payId = payId;
    }

    public String getPayId() {
        return payId;
    }

    public void setAppDevices(Set<String> appDevices) {
        this.appDevices = appDevices;
    }

    public Set<String> getAppDevices() {
        return appDevices;
    }

    public void addAppDevice(String device) {
        this.appDevices.add(device);
    }

    public void removeAppDevice(String device) {
        this.appDevices.remove(device);
    }
}

