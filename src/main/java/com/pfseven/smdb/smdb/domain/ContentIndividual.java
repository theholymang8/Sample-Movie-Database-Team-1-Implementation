package com.pfseven.smdb.smdb.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import lombok.experimental.SuperBuilder;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

//Lombok
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true, exclude = {"individual"})
//Hibernate
@Entity
@Table(name = "CONTENT_INDIVIDUALS")
//Serializable
@SequenceGenerator(name = "idGenerator", sequenceName = "CONTENT_INDIVIDUALS_SEQ", allocationSize = 1)
public class ContentIndividual extends BaseModel {

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CONTENT_ID")
    @JsonIgnoreProperties("contentIndividuals")
    private Content content;

    @NotNull
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "INDIVIDUAL_ID")
    @JsonIgnoreProperties("contentIndividuals")
    private Individual individual;

    @NotNull
    @Enumerated(EnumType.STRING)
    private IndividualRole contributingRole;
}