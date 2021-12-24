package com.pfseven.smdb.smdb.domain;


import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Data
@ToString
@EqualsAndHashCode
@Table(name = "PRODUCER")
@SequenceGenerator(name = "idGenerator", sequenceName = "PRODUCER_SEQ", allocationSize = 1)
@PrimaryKeyJoinColumn(foreignKey=@ForeignKey(name = "INDIVIDUALS_FK_ID_P"))
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
