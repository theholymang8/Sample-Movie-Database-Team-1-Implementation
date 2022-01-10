package com.pfseven.smdb.smdb.dto;

import com.pfseven.smdb.smdb.domain.Award;
import com.pfseven.smdb.smdb.domain.Content;
import com.pfseven.smdb.smdb.domain.IndividualRole;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.List;
import java.util.Map;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Data
@SuperBuilder
public class IndividualAndAssociations {

    String firstName;

    String lastName;

    Integer age;

    String nationality;

    Map<IndividualRole, List<Content>> associatedContent;

    Set<Award> awards;

}
