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
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@Table(name = "WRITER")
@SequenceGenerator(name = "idGenerator", sequenceName = "WRITER_SEQ", initialValue = 1, allocationSize = 1)
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
