package com.pfseven.smdb.smdb.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

//Experimental -Put in comment if problematic-
//@JsonIgnoreProperties({"handler", "hibernateLazyInitializer"})
//Project Lombok
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
//@ToString(callSuper = true)
@ToString(callSuper = true, exclude = {"content", "individual"})
@EqualsAndHashCode(callSuper = true, exclude = {"content", "individual"})
//@EqualsAndHashCode(callSuper = true)
@Data
//Entity
@Entity
@Table(name = "AWARDS")
//Serializable
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
