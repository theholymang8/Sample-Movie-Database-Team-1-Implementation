package com.pfseven.smdb.smdb.domain;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

//Project Lombok
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@Data
//Hibernate
@Entity
@Table(name = "FILMS")
@PrimaryKeyJoinColumn(foreignKey=@ForeignKey(name = "CONTENT_FK_ID_F"))
//Serializable
@SequenceGenerator(name = "idGenerator", sequenceName = "FILM_SEQ", allocationSize = 1)
public class Film extends Content{

    @Enumerated(EnumType.STRING)
    private FilmUniverse filmUniverse;

}
