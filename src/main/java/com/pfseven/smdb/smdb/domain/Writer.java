package com.pfseven.smdb.smdb.domain;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@SuperBuilder
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@Table(name = "WRITER")
@SequenceGenerator(name = "idGenerator", sequenceName = "WRITER_SEQ", initialValue = 1, allocationSize = 1)
public class Writer extends Individual{

    //Films
    @OneToMany(mappedBy = "writer")
    private List<Film> films;

    //Screenplay(s)
    private String screenPlays;


}
