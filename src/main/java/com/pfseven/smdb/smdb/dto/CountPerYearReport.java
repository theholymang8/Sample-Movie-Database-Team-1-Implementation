package com.pfseven.smdb.smdb.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CountPerYearReport {

    @JsonProperty("Tv Shows")
    Long count;

    @JsonProperty("Year")
    String year;
}
