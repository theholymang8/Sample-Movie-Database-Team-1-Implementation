package com.pfseven.smdb.smdb.domain;


import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@SuperBuilder
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@Table(name = "ACTOR")
@SequenceGenerator(name = "idGenerator", sequenceName = "ACTOR_SEQ", initialValue = 1, allocationSize = 1)
public class Actor extends Individual{

    //Films
    @ManyToMany//(mappedBy = "actors")
    @JoinTable(
            name = "actors_films",
            joinColumns = @JoinColumn(name = "actor_id"),
            inverseJoinColumns = @JoinColumn(name = "film_id"))
    private List<Film> films;

    //Role
    @NotNull(message = "{role.null}")
    private String role;

    //TvShows
    @ManyToMany//(mappedBy = "actors")
    @JoinTable(
            name = "actors_tvShows",
            joinColumns = @JoinColumn(name = "actor_id"),
            inverseJoinColumns = @JoinColumn(name = "tvShow_id"))
    private List<TvShow> tvShows;

    //awards
    @NotNull(message = "{awards.null}")
    private String awards;
}
