package com.pfseven.smdb.smdb.domain;


import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@Table(name = "PRODUCER")
@SequenceGenerator(name = "idGenerator", sequenceName = "PRODUCER_SEQ", initialValue = 1, allocationSize = 1)
public class Producer extends Individual{

    //Films
    @ManyToMany(mappedBy = "producers")
    private Set<Film> films = new HashSet<>();

    //TvShows
    @ManyToMany(mappedBy = "producers")
    private Set<TvShow> tvShows = new HashSet<>();

    //Contributions
    private BigDecimal contributions;

    //Production Company
    private String productionCompany;



}
