import filter.dto.FilterDTO;

import java.util.Collection;
import java.util.Date;
import java.util.UUID;

public class RequestDTO {
    private Collection<FilterDTO> filters;
    private Date meetingTime;
    private UUID clientId;
    
    public RequestDTO(Collection<FilterDTO> filters, Date meetingTime, UUID clientId) {
        this.filters = filters;
        this.meetingTime = meetingTime;
        this.clientId = clientId; //TODO should this be a Client object?
    }

    public Collection<FilterDTO> getFilters() {
        return filters;
    }

    public void setFilters(Collection<FilterDTO> filters) {
        this.filters = filters;
    }

    public Date getMeetingTime() {
        return meetingTime;
    }

    public void setMeetingTime(Date meetingTime) {
        this.meetingTime = meetingTime;
    }

    public UUID getClientId() {
        return clientId;
    }

    public void setClientId(UUID clientId) {
        this.clientId = clientId;
    }
}
