package filter.dto;

import categoricals.ServiceTier;

public class ServiceTierFilterDTO {
    private ServiceTier tier;
    ServiceTierFilterDTO(ServiceTier tier) {
        setTier(tier);
    }

    public ServiceTier getTier() {
        return tier;
    }

    public void setTier(ServiceTier tier) {
        this.tier = tier;
    }
}
