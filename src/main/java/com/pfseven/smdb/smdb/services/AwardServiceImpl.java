package com.pfseven.smdb.smdb.services;

import com.pfseven.smdb.smdb.domain.Award;
import org.springframework.data.jpa.repository.JpaRepository;

public class AwardServiceImpl extends BaseServiceImpl<Award> implements AwardService{
    @Override
    public JpaRepository<Award, Long> getRepository() {
        return null;
    }
}
