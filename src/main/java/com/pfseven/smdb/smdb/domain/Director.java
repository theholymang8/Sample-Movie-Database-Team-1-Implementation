package com.pfseven.smdb.smdb.domain;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
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
@Table(name = "DIRECTORS")
@PrimaryKeyJoinColumn(foreignKey=@ForeignKey(name = "INDIVIDUALS_FK_ID_D"))
//Serializable
@SequenceGenerator(name = "idGenerator", sequenceName = "DIRECTOR_SEQ", allocationSize = 1)
public class Director extends Individual{

    private String publicityListings;

    @ManyToMany(mappedBy = "directors")
    private Set<Film> films = new HashSet<>();

    @ManyToMany(mappedBy = "directors")
    private Set<TvShow> tvShows = new HashSet<>();

}
