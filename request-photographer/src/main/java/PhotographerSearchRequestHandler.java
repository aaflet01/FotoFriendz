import com.amazonaws.handlers.RequestHandler2;
import filter.dto.FilterDTO;
import filter.dto.MeetingLocationFilterDTO;
import filter.dto.PhotographerRatingFilterDTO;
import filter.dto.ServiceTierFilterDTO;
import filter.handler.FilterHandler;
import filter.handler.MeetingLocationFilterHandler;
import filter.handler.PhotographerRatingFilterHandler;
import filter.handler.ServiceTierFilterHandler;

import java.util.HashMap;
import java.util.Map;

public class PhotographerSearchRequestHandler extends RequestHandler2 {

    private static final Map<Class<? extends FilterDTO>, Class<? extends FilterHandler>> filterHandlerMap;
    static {
        Map<Class<? extends FilterDTO>, Class<? extends FilterHandler>> temp = new HashMap<>();
        temp.put(MeetingLocationFilterDTO.class, MeetingLocationFilterHandler.class);
        temp.put(PhotographerRatingFilterDTO.class, PhotographerRatingFilterHandler.class);
        temp.put(ServiceTierFilterDTO.class, ServiceTierFilterHandler.class);
        filterHandlerMap = temp;
    }

    //TODO handle requests and stuff

}
