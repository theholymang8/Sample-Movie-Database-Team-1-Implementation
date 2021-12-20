package com.pfseven.smdb.smdb.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

@SuperBuilder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BaseModel implements Serializable {
    private static final Long serialVersionUID=1L;

    private Long id;
}
