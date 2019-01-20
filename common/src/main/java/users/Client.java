package users;

import categoricals.ClientRating;

import java.awt.geom.Point2D;
import java.util.Set;
import java.util.UUID;

public class Client extends User {
    private ClientRating clientRating;

    public Client(final UUID userId, final String name, final String email, final Point2D location,
                  final String payId, final Set<String> appDevices, final ClientRating clientRating) {
        super(userId, name, email, location, payId, appDevices);
        this.clientRating = clientRating;
    }

    public ClientRating getClientRating() {
        return clientRating;
    }

    public void setClientRating(ClientRating clientRating) {
        this.clientRating = clientRating;
    }
}
