package com.pfseven.smdb.smdb.domain;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@SuperBuilder
@ToString
@EqualsAndHashCode
@Table(name = "WRITER")
@SequenceGenerator(name = "idGenerator", sequenceName = "WRITER_SEQ", allocationSize = 1)
@PrimaryKeyJoinColumn(foreignKey=@ForeignKey(name = "INDIVIDUALS_FK_ID_W"))
public class Writer extends Individual{

    //Films
    @ManyToMany(mappedBy = "writers")
    private Set<Film> films = new HashSet<>();

    //TvShows
    @ManyToMany(mappedBy = "writers")
    private Set<TvShow> tvShows = new HashSet<>();

    //Screenplay(s)
    private String screenPlays;


}
