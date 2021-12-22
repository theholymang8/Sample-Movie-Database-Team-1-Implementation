package com.pfseven.smdb.smdb.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "FILM")
@SequenceGenerator(name = "idGenerator", sequenceName = "FILM_SEQ", initialValue = 1, allocationSize = 1)
public class Film extends BaseModel{

    //Title
    @NotNull(message = "{title.null}")
    @Column(length = 70, nullable = false)
    private String title;

    //Description
    @NotNull(message = "{description.null}")
    @Column(length = 3000, nullable = false)
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

    //Director(s)
    @ManyToOne
    private Director director;

    //Producer(s)
    @ManyToOne
    private Producer producer;

    @ManyToOne
    private Writer writer;

    //Actors
    @ManyToMany(mappedBy = "films", fetch = FetchType.LAZY)
    private List<Actor> actors;

    //Awards
    @NotNull(message = "{awards.null}")
    private String awards;

}
