package com.pfseven.smdb.smdb.domain;


import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

//Project Lombok
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
//Hibernate
@Entity
@Table(name = "PRODUCERS")
@PrimaryKeyJoinColumn(foreignKey=@ForeignKey(name = "INDIVIDUALS_FK_ID_P"))
//Serializable
@SequenceGenerator(name = "idGenerator", sequenceName = "PRODUCER_SEQ", allocationSize = 1)
public class Producer extends Individual{

    private BigDecimal contributions;

    private String productionCompany;

    @ManyToMany(mappedBy = "producers")
    private Set<Film> films = new HashSet<>();

    @ManyToMany(mappedBy = "producers")
    private Set<TvShow> tvShows = new HashSet<>();

}
