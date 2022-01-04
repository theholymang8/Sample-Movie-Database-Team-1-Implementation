package com.pfseven.smdb.smdb.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//Project Lombok
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@ToString(callSuper = true, exclude = {"awards", "genres", "contentIndividuals"})
//@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true, exclude = {"awards", "contentIndividuals", "genres"})
//@EqualsAndHashCode(callSuper = true)
@Data
//Hibernate
@Entity
@Table(name = "CONTENTS")
@Inheritance(strategy = InheritanceType.JOINED)
//Serializable
@SequenceGenerator(name = "idGenerator", sequenceName = "CONTENT_SEQ", allocationSize = 1)
public class Content extends BaseModel{

    @NotNull(message = "{title.null}")
    @Column(length = 70, nullable = false)
    private String title;

    @NotNull(message = "{description.null}")
    @Column(length = 4096, nullable = false)
    private String description;

    @NotNull(message = "{genre.null}")
    @ElementCollection(fetch = FetchType.EAGER, targetClass=Genre.class)
    @Enumerated(EnumType.STRING)
    @CollectionTable(name = "CONTENT_GENRE")
    @Column(name = "GENRE")
    //@OrderBy
    private Set<Genre> genres = new HashSet<>();

    @NotNull(message = "{length.null}")
    @Column(length = 3, nullable = false)
    private Integer length;

    @NotNull(message = "{rating.null}")
    @Column(length = 3, nullable = false)
    private Float rating;

    @NotNull(message = "{budget.null}")
    @Column(length = 20, nullable = false)
    private BigDecimal budget;

    @NotNull(message = "{revenue.null}")
    @Column(length = 20, nullable = false) //precision = 2
    private BigDecimal revenue;

    @NotNull(message = "{releaseDate.null}")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    //@Temporal(TemporalType.DATE)
    @Column(nullable = false)
    //Development
    @Getter(AccessLevel.NONE)
    private LocalDate releaseDate;

    @NotNull(message = "{language.null}")
    @Column(length = 500, nullable = false)
    private String language;

    @NotNull(message = "{countryOfOrigin.null}")
    @Column(length = 500, nullable = false)
    private String countryOfOrigin;

    //@NotNull(message = "{awards.null}")
    @JsonManagedReference("awards")
    @OneToMany(mappedBy = "content", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private Set<Award> awards = new HashSet<>();

    //@NotNull(message = "{individuals.null}")
    /*@ManyToMany(cascade = {CascadeType.MERGE, CascadeType.REFRESH}, fetch = FetchType.EAGER)
    @JoinTable(
            name = "CONTENT_INDIVIDUALS",
            foreignKey = @ForeignKey(name = "CONTENT_FK_ID_P"),
            inverseForeignKey = @ForeignKey(name = "INDIVIDUAL_FK_ID"),
            joinColumns = @JoinColumn(name="CONTENT_ID"),
            inverseJoinColumns = @JoinColumn(name="INDIVIDUAL_ID"))*/
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "content")
    private List<ContentIndividual> contentIndividuals = new ArrayList<>();

    //Custom Getter for daterRelease data -experimental-
    public String getReleaseDate(){
        return this.releaseDate.toString();
    }

}
