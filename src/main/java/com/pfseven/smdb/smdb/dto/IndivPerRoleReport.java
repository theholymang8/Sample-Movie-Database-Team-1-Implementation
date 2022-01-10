package com.pfseven.smdb.smdb.dto;

import com.pfseven.smdb.smdb.domain.ContentIndividual;
import com.pfseven.smdb.smdb.domain.Individual;
import com.pfseven.smdb.smdb.domain.IndividualRole;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class IndivPerRoleReport {

    IndividualRole contributingRole;

    ContentIndividual contentIndividual;
    //String firstName;

}
