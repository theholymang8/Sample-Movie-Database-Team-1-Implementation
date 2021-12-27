package com.pfseven.smdb.smdb.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

//Project Lombok
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@Data
//Entity
@Entity
@Table(name = "AWARDS")
//Serializable
@SequenceGenerator(name = "idGenerator", sequenceName = "AWARD_SEQ", allocationSize = 1)
public class Award extends BaseModel{

    @NotNull(message = "{title.null}")
    @Column(length = 50, nullable = false)
    private String title;

    @NotNull(message = "{releaseDate.null}")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @Column(nullable = false)
    private Date dateOfAward;

    @NotNull(message = "{category.null}")
    @Column(length = 4096, nullable = false)
    private String Category;

    @ManyToOne
    private Content content;

    @ManyToOne
    private Individual individual;
}
