package com.pfseven.smdb.smdb.projections;

import com.pfseven.smdb.smdb.domain.IndividualRole;

public interface ContentIndividual {

    Long getId();

    IndividualRole getContributingRole();

    Long getContent();

    Long getIndividual();

}
