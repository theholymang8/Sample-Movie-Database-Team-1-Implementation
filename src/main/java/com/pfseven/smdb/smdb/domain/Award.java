package com.pfseven.smdb.smdb.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import javax.validation.constraints.NotNull;


@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@ToString(callSuper = true, exclude = {"content", "individual"})
@EqualsAndHashCode(callSuper = true, exclude = {"content", "individual"})
@Data

@Entity
@Table(name = "AWARDS")

@SequenceGenerator(name = "idGenerator", sequenceName = "AWARD_SEQ", allocationSize = 1)
public class Award extends BaseModel{

    @NotNull(message = "{title.null}")
    @Column(length = 500, nullable = false)
    private String title;

    @NotNull(message = "{releaseDate.null}")
    @Column(nullable = false)
    private String yearOfAward;

    @NotNull(message = "{category.null}")
    @Column(length = 4096, nullable = false)
    private String category;

    @JsonBackReference("awardsCont")
    @ManyToOne(fetch = FetchType.LAZY)
    private Content content;

    @JsonBackReference("awardsInd")
    @ManyToOne(fetch = FetchType.LAZY)
    private Individual individual;
}
