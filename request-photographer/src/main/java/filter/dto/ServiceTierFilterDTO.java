package filter.dto;

public class ServiceTierFilterDTO implements FilterDTO {
    private int tier; //TODO change to enum
    ServiceTierFilterDTO(int tier) {
        this.tier = tier;
    }

    public int getTier() {
        return tier;
    }

    public void setTier(int tier) {
        this.tier = tier;
    }
}
