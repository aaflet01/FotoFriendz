package users;

import categoricals.PhotographerRating;

import java.awt.geom.Point2D;
import java.util.Set;
import java.util.UUID;

public class Photographer extends User {
    private PhotographerRating photographerRating;
    private Set<String> cameraDevices; //TODO probably change to some other class

    public Photographer(final UUID userId, final String name, final String email, final Point2D location,
                        final String payId, final Set<String> appDevices, final PhotographerRating photographerRating,
                        final Set<String> cameraDevices) {
        super(userId, name, email, location, payId, appDevices);
        this.photographerRating = photographerRating;
        this.cameraDevices = cameraDevices;
    }

    public void setPhotographerRating(PhotographerRating photographerRating) {
        this.photographerRating = photographerRating;
    }

    public PhotographerRating getPhotographerRating() {
        return photographerRating;
    }

    public void setCameraDevices(Set<String> cameraDevices) {
        this.cameraDevices = cameraDevices;
    }

    public Set<String> getCameraDevices() {
        return cameraDevices;
    }

    public void addDevice(String device) {
        this.cameraDevices.add(device);
    }

    public void removeDevice(String device) {
        this.cameraDevices.remove(device);
    }
}
