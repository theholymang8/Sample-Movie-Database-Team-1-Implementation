package com.pfseven.smdb.smdb.projections;

import com.pfseven.smdb.smdb.domain.IndividualRole;

public interface ContentIndividualProjection {

    Long getId();

    IndividualRole getContributingRole();

    Long getContent_ID();

    Long getIndividual_ID();

}
