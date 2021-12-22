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
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@Table(name = "ACTOR")
@SequenceGenerator(name = "idGenerator", sequenceName = "ACTOR_SEQ", initialValue = 1, allocationSize = 1)
@Inheritance(strategy = InheritanceType.JOINED)
public class Actor extends Individual{

    //Films
    //SEE AGAIN
    @ManyToMany(mappedBy = "actors")
    private Set<Film> films = new HashSet<>();

    //Role
    @NotNull(message = "{role.null}")
    private String role;

    //TvShows
    @ManyToMany(mappedBy = "actors")
    private Set<TvShow> tvShows;

    //awards
}
