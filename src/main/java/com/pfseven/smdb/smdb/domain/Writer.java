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
@Table(name = "WRITER")
@PrimaryKeyJoinColumn(foreignKey=@ForeignKey(name = "INDIVIDUALS_FK_ID_W"))
//Serializable
@SequenceGenerator(name = "idGenerator", sequenceName = "WRITER_SEQ", allocationSize = 1)
public class Writer extends Individual{

    private String screenPlays;

    @ManyToMany(mappedBy = "writers")
    private Set<Film> films = new HashSet<>();

    @ManyToMany(mappedBy = "writers")
    private Set<TvShow> tvShows = new HashSet<>();

}
