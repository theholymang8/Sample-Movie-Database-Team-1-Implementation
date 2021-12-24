package com.pfseven.smdb.smdb.domain;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@Table(name = "DIRECTOR")
@SequenceGenerator(name = "idGenerator", sequenceName = "DIRECTOR_SEQ", allocationSize = 1)
@PrimaryKeyJoinColumn(foreignKey=@ForeignKey(name = "INDIVIDUALS_FK_ID_D"))
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
