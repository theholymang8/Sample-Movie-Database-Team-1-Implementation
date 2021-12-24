package com.pfseven.smdb.smdb.domain;


import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

//Project Lombok
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
//Hibernate
@Entity
@Table(name = "ACTOR")
@PrimaryKeyJoinColumn(foreignKey=@ForeignKey(name = "INDIVIDUALS_FK_ID_A"))
//Serializable
@SequenceGenerator(name = "idGenerator", sequenceName = "ACTOR_SEQ", allocationSize = 1)
public class Actor extends Individual{

    @ManyToMany(mappedBy = "actors")
    private Set<Film> films = new HashSet<>();

    @ManyToMany(mappedBy = "actors")
    private Set<TvShow> tvShows = new HashSet<>();

    @NotNull(message = "{role.null}")
    private String role;

}

