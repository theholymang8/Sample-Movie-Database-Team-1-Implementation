package com.pfseven.smdb.smdb.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import lombok.experimental.SuperBuilder;
import net.bytebuddy.implementation.bind.annotation.Super;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

//Lombok
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
//Hibernate
@Entity
@Table(name = "CONTENT_INDIVIDUALS")
//Serializable
@SequenceGenerator(name = "idGenerator", sequenceName = "CONTENT_INDIVIDUALS_SEQ", allocationSize = 1)
public class ContentIndividual extends BaseModel {

    //@JsonBackReference("content")
    @NotNull
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "CONTENT_ID")
    @JsonIgnoreProperties("contentIndividuals")
    private Content content;

    //@JsonBackReference("individuals")
    @NotNull
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "INDIVIDUAL_ID")
    @JsonIgnoreProperties("contentIndividuals")
    private Individual individual;

    //@Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private IndividualRole contributingRole;
}
