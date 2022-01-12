package com.pfseven.smdb.smdb.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@JsonIgnoreProperties({"handler", "hibernateLazyInitializer"})
//Project Lombok
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Data
@ToString(callSuper = true, exclude = {"awards", "contentIndividuals"})
//@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true, exclude = {"awards", "contentIndividuals"})
//@EqualsAndHashCode(callSuper = true)
//Hibernate
@Entity
@Table(name = "INDIVIDUALS")
@Inheritance(strategy = InheritanceType.JOINED)
//Serializable
@SequenceGenerator(name = "idGenerator", sequenceName = "INDIVIDUAL_SEQ", allocationSize = 1)
public class Individual extends BaseModel{

    @NotNull(message = "{email.null}")
    @Pattern(regexp = "^[A-Za-z0-9+_.-]+@(.+)$", message = "{email.format}")
    @Column(length = 100, nullable = false, unique = true )
    private String email;

    @NotNull(message = "{firstname.null}")
    @Column(length = 40, nullable = false)
    private String firstName;

    @NotNull(message = "{lastname.null}")
    @Column(length = 60, nullable = false)
    private String lastName;

    @NotNull(message = "{age.null}")
    @Min(value = 12, message = "{age.min}")
    @Max(value = 110, message = "{age.max}")
    @Column(length = 3, nullable = false)
    private Integer age;

    @NotNull(message = "{nationality.null}")
    @Column(length = 75, nullable = false)
    private String nationality;


    @ElementCollection(fetch = FetchType.EAGER, targetClass= IndividualRole.class)
    @Enumerated(EnumType.STRING)
    @CollectionTable(name = "INDIVIDUAL_ROLE")
    @Column(name = "ROLE")
    private Set<IndividualRole> individualRole = new HashSet<>();

    //@JsonManagedReference("content")
    @JsonIgnoreProperties("individual")
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "individual")
    private final Set<ContentIndividual> contentIndividuals =  new HashSet<>();

    @JsonManagedReference("awardsInd")
    @OneToMany(mappedBy = "individual", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private final Set<Award> awards = new HashSet<>();

}
