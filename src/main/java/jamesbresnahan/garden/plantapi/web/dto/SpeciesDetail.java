package jamesbresnahan.garden.plantapi.web.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class SpeciesDetail {
    private GrowthProfile growthProfile;
    
}
