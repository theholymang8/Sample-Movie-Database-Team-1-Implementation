package com.pfseven.smdb.smdb.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Individual extends BaseModel{

    private String email;

    private String firstName;

    private String lastName;

    private String age;
}
