package com.pfseven.smdb.smdb.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Date;;
import java.util.List;



@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@EqualsAndHashCode
@Entity
@Table(name = "TV_SHOW")
@SequenceGenerator(name = "idGenerator", sequenceName = "TV_SHOW_SEQ", initialValue = 1, allocationSize = 1)
public class TvShow extends Content{

    @NotNull(message = "{seasons.null}")
    @Column(length = 3)
    private Integer seasons;

    @NotNull(message = "{episodes.null}")
    @Column(length = 4)
    private Integer episodes;

}
