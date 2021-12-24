package com.pfseven.smdb.smdb.domain;


import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import javax.validation.constraints.NotNull;




@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
//@SuperBuilder
@Entity
@Table(name = "TV_SHOW")
@SequenceGenerator(name = "idGenerator", sequenceName = "TV_SHOW_SEQ", allocationSize = 1)
@PrimaryKeyJoinColumn(foreignKey=@ForeignKey(name = "CONTENT_FK_ID_TV"))
public class TvShow extends Content{

    @NotNull(message = "{seasons.null}")
    @Column(length = 3)
    private Integer seasons;

    @NotNull(message = "{episodes.null}")
    @Column(length = 4)
    private Integer episodes;

}
