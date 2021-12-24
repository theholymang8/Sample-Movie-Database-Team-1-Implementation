package com.pfseven.smdb.smdb.domain;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;


@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Data
@Entity
@Table(name = "FILM")
@SequenceGenerator(name = "idGenerator", sequenceName = "FILM_SEQ", allocationSize = 1)
@PrimaryKeyJoinColumn(foreignKey=@ForeignKey(name = "CONTENT_FK_ID_F"))
public class Film extends Content{


    private FilmUniverse filmUniverse;

}
