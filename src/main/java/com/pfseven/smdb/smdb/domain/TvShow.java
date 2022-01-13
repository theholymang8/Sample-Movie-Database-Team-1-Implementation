package com.pfseven.smdb.smdb.domain;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import javax.validation.constraints.NotNull;


//Project Lombok
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
//Hibernate
@Entity
@Table(name = "TV_SHOWS")
@PrimaryKeyJoinColumn(foreignKey=@ForeignKey(name = "CONTENT_FK_ID_TV"))
//Serializable
@SequenceGenerator(name = "idGenerator", sequenceName = "TV_SHOW_SEQ", allocationSize = 1)
public class TvShow extends Content{

    @NotNull(message = "{seasons.null}")
    @Column(length = 3)
    private Integer seasons;

    @NotNull(message = "{episodes.null}")
    @Column(length = 4)
    private Integer episodes;

}
