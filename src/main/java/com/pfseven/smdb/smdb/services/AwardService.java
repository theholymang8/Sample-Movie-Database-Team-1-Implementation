package com.pfseven.smdb.smdb.services;

import com.pfseven.smdb.smdb.domain.Award;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AwardService extends BaseService<Award, Long>{

    Award findByTitle(String title);

    List<Award> findByCategory(String category);
}
