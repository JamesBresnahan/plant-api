package jamesbresnahan.garden.plantapi.web.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class SpeciesSummary {
    private Long id;
    private String commonName;
    private Long genusId;

}
