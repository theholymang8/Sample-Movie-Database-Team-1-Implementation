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


@Data
@Entity
@Table(name = "FILM")
@SequenceGenerator(name = "idGenerator", sequenceName = "FILM_SEQ", initialValue = 1, allocationSize = 1)
@PrimaryKeyJoinColumn(foreignKey=@ForeignKey(name = "CONTENT_FK_ID_F"))
public class Film extends Content{

    //ONE EXTRA ATTRIBUTE

}
