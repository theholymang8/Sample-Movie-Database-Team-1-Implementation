package com.pfseven.smdb.smdb.domain;


import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

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
    @OneToMany(mappedBy = "producer", fetch = FetchType.LAZY)
    private List<Film> films;

    //TvShows
    @OneToMany(mappedBy = "producer", fetch = FetchType.LAZY)
    private List<TvShow> tvShows;

    //Contributions
    private BigDecimal contributions;

    //Production Company
    private String productionCompany;



}
