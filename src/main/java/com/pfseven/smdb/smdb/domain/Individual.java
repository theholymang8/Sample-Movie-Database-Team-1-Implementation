package com.pfseven.smdb.smdb.domain;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@AllArgsConstructor
@NoArgsConstructor
@Data
@SuperBuilder
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "INDIVIDUALS")
@SequenceGenerator(name = "idGenerator", sequenceName = "INDIVIDUAL_SEQ", allocationSize = 1)
@Inheritance(strategy = InheritanceType.JOINED)

public class Individual extends BaseModel{

    @NotNull(message = "{email.null}")
    @Pattern(regexp = "^[A-Za-z0-9+_.-]+@(.+)$", message = "{email.format}")
    @Column(length = 65, nullable = false, unique = true )
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
    private String age;

    @NotNull(message = "{nationality.null}")
    @Column(length = 15, nullable = false)
    private String nationality;

    @NotNull(message = "{awards.null}")
    private String awards;

}
