package com.pfseven.smdb.smdb.services;

import com.pfseven.smdb.smdb.domain.Award;
import com.pfseven.smdb.smdb.projections.AwardProjection;

import java.util.List;

public interface AwardService extends BaseService<Award, Long>{

    Award findByTitle(String title);

    List<Award> findByCategory(String category);

    List<Award> findByYear(String year);

    List<AwardProjection> getAwards();
}
