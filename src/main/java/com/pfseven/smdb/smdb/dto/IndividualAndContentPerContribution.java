package com.pfseven.smdb.smdb.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.pfseven.smdb.smdb.domain.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class IndividualAndContentPerContribution {

    @JsonProperty("Individual Name")
    String firstName;

    @JsonProperty("Individual Last Name")
    String lastName;

    @JsonProperty("Title")
    String title;

    @JsonProperty("Description")
    String description;

    @JsonProperty("Genres")
    Set<Genre> genres;

    @JsonProperty("Released")
    LocalDate releaseDate;

    @JsonProperty("Contribution")
    IndividualRole contributingRole;

}
