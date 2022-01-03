package com.pfseven.smdb.smdb.domain;

import lombok.*;
import lombok.experimental.SuperBuilder;
import net.bytebuddy.implementation.bind.annotation.Super;

import javax.persistence.*;
import java.io.Serializable;

//Lombok
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@ToString(exclude = {"content", "individual"})
@EqualsAndHashCode(exclude = {"content", "individual"})
//Hibernate
@Entity
@Table(name = "CONTENT_INDIVIDUALS")
//Serializable
@SequenceGenerator(name = "idGenerator", sequenceName = "CONTENT_INDIVIDUALS_SEQ", allocationSize = 1)
public class ContentIndividual extends BaseModel {

    @ManyToOne
    @JoinColumn(name = "CONTENT_ID")
    private Content content;

    @ManyToOne
    @JoinColumn(name = "INDIVIDUAL_ID")
    private Individual individual;

    //@Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private IndividualRole contributingRole;
}
