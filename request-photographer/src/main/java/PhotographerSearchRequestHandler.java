import com.amazonaws.Request;
import com.amazonaws.handlers.RequestHandler2;
import com.amazonaws.services.sns.AmazonSNS;
import filter.dto.MeetingLocationFilterDTO;
import filter.dto.PhotographerRatingFilterDTO;
import filter.dto.ServiceTierFilterDTO;
import filter.handler.FilterHandler;
import filter.handler.MeetingLocationFilterHandler;
import filter.handler.PhotographerRatingFilterHandler;
import filter.handler.ServiceTierFilterHandler;
import users.Client;
import users.Photographer;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PhotographerSearchRequestHandler extends RequestHandler2 {

    private static final Map<Class<?>, Class<? extends FilterHandler>> filterHandlerMap;
    static {
        Map<Class<?>, Class<? extends FilterHandler>> temp = new HashMap<>();
        temp.put(MeetingLocationFilterDTO.class, MeetingLocationFilterHandler.class);
        temp.put(PhotographerRatingFilterDTO.class, PhotographerRatingFilterHandler.class);
        temp.put(ServiceTierFilterDTO.class, ServiceTierFilterHandler.class);
        filterHandlerMap = temp;
    }


    public void requestHandler(RequestDTO requestData) {
        //TODO create the query (including distance calculations)

        //TODO perform the query

        //TODO create rows in databases

        //TODO send request info to photographers

        //TODO send photographer count to client
    }


    public void createDbQuery(RequestDTO requestData) {
        //TODO build the query
    }


    public void executeDbQuery(Object query) {
        //TODO execute the query
    }


    public void saveRequestToDb(RequestDTO requestData, Set<Photographer> candidates) {
        //TODO make rows in the db
    }

    public void notifyClient(Client client, int numPhotographers) {

        //TODO push to client
        //AmazonSNS()
    }


    public void notifyPhotographerCandidates(RequestDTO requestData, Set<Photographer> candidates) {
        //TODO push to photographers
    }
}
