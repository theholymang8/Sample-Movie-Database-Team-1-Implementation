package com.pfseven.smdb.smdb.domain;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@Table(name = "DIRECTOR")
@SequenceGenerator(name = "idGenerator", sequenceName = "DIRECTOR_SEQ", initialValue = 1, allocationSize = 1)
public class Director extends Individual{

    //Films
    @OneToMany(mappedBy = "director", fetch = FetchType.LAZY)
    private List<Film> films;

    //TvShows
    @OneToMany(mappedBy = "director", fetch = FetchType.LAZY)
    private List<TvShow> tvShows;

    //Publicity Listings
    private String publicityListings;


}
