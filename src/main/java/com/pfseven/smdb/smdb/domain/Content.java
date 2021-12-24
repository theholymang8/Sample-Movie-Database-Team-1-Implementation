package com.pfseven.smdb.smdb.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Data
@Entity
@Table(name = "CONTENTS")
@SequenceGenerator(name = "idGenerator", sequenceName = "CONTENT_SEQ", initialValue = 1, allocationSize = 1)
@Inheritance(strategy = InheritanceType.JOINED)
public class Content extends BaseModel{
    //Title
    @NotNull(message = "{title.null}")
    @Column(length = 70, nullable = false)
    private String title;

    //Description
    @NotNull(message = "{description.null}")
    @Column(length = 4096, nullable = false)
    private String description;

    //Genre
    @NotNull(message = "{genre.null}")
    @Enumerated(EnumType.STRING)
    @Column(length = 50, nullable = false)
    private Genre genre;

    //Length
    @NotNull(message = "{length.null}")
    @Column(length = 3, nullable = false)
    private Integer length;

    //Rating
    @NotNull(message = "{rating.null}")
    @Column(length = 3, nullable = false)
    private Float rating;

    //Budget
    @NotNull(message = "{budget.null}")
    @Column(precision = 2, length = 20, nullable = false)
    private BigDecimal budget;

    //Revenue
    @NotNull(message = "{revenue.null}")
    @Column(precision = 2, length = 20, nullable = false)
    private BigDecimal revenue;

    //Release Date
    @NotNull(message = "{releaseDate.null}")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Date releaseDate;

    //Language
    @NotNull(message = "{language.null}")
    @Column(length = 50, nullable = false)
    private String language;

    //Country of Origin
    @NotNull(message = "{countryOfOrigin.null}")
    @Column(length = 50, nullable = false)
    private String countryOfOrigin;

    @NotNull(message = "{awards.null}")
    private String awards;

    @NotNull(message = "{producers.null}")
    @ManyToMany(cascade = {CascadeType.MERGE, CascadeType.REFRESH}, fetch = FetchType.LAZY)
    @JoinTable(
            name = "CONTENT_PRODUCERS",
            foreignKey = @ForeignKey(name = "CONTENT_FK_ID_P"),
            inverseForeignKey = @ForeignKey(name = "PRODUCER_FK_ID"),
            joinColumns = @JoinColumn(name="CONTENT_ID"),
            inverseJoinColumns = @JoinColumn(name="PRODUCER_ID"))
    private Set<Producer> producers = new HashSet<>();

    @ManyToMany(cascade = {CascadeType.MERGE, CascadeType.REFRESH}, fetch = FetchType.LAZY)
    @JoinTable(
            name = "CONTENT_WRITERS",
            foreignKey = @ForeignKey(name = "CONTENT_FK_ID_W"),
            inverseForeignKey = @ForeignKey(name = "WRITER_FK_ID"),
            joinColumns = @JoinColumn(name="CONTENT_ID"),
            inverseJoinColumns = @JoinColumn(name="WRITER_ID"))
    private Set<Writer> writers = new HashSet<>();

    @ManyToMany(cascade = {CascadeType.MERGE, CascadeType.REFRESH}, fetch = FetchType.LAZY)
    @JoinTable(
            name = "CONTENT_DIRECTORS",
            foreignKey = @ForeignKey(name = "CONTENT_FK_ID_D"),
            inverseForeignKey = @ForeignKey(name = "DIRECTOR_FK_ID"),
            joinColumns = @JoinColumn(name="CONTENT_ID"),
            inverseJoinColumns = @JoinColumn(name="DIRECTOR_ID"))
    private Set<Director> directors = new HashSet<>();

    @ManyToMany(cascade = {CascadeType.MERGE, CascadeType.REFRESH}, fetch = FetchType.LAZY)
    @JoinTable(
            name = "CONTENT_ACTORS",
            foreignKey = @ForeignKey(name = "CONTENT_FK_ID_A"),
            inverseForeignKey = @ForeignKey(name = "ACTOR_FK_ID"),
            joinColumns =  @JoinColumn(name="CONTENT_ID"),
            inverseJoinColumns = @JoinColumn(name="ACTOR_ID"))
    private Set<Actor> actors = new HashSet<>();


}
