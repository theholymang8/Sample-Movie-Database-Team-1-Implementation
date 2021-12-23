package com.pfseven.smdb.smdb.domain;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@Table(name = "DIRECTOR")
@SequenceGenerator(name = "idGenerator", sequenceName = "DIRECTOR_SEQ", initialValue = 1, allocationSize = 1)
//INHERITANCE
public class Director extends Individual{

    //Films
    @ManyToMany(mappedBy = "directors")
    private Set<Film> films = new HashSet<>();

    //TvShows
    @ManyToMany(mappedBy = "directors")
    private Set<TvShow> tvShows = new HashSet<>();

    //Publicity Listings
    private String publicityListings;


}
