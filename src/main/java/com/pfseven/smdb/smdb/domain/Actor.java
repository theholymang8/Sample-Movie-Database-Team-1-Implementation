package com.pfseven.smdb.smdb.domain;


import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@EqualsAndHashCode
@SuperBuilder
@Table(name = "ACTOR")
@SequenceGenerator(name = "idGenerator", sequenceName = "ACTOR_SEQ", allocationSize = 1)
@PrimaryKeyJoinColumn(foreignKey=@ForeignKey(name = "INDIVIDUALS_FK_ID_A"))
public class Actor extends Individual{

    //Films
    //SEE AGAIN
    @ManyToMany(mappedBy = "actors")
    private Set<Film> films = new HashSet<>();

    //TvShows
    @ManyToMany(mappedBy = "actors")
    private Set<TvShow> tvShows = new HashSet<>();

    //Role
    @NotNull(message = "{role.null}")
    private String role;


    //awards
}
