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
public class Film extends Content{

    //ONE EXTRA ATTRIBUTE

}
