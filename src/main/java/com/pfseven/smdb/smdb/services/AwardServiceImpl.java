package com.pfseven.smdb.smdb.services;

import com.pfseven.smdb.smdb.domain.Award;
import com.pfseven.smdb.smdb.repositories.AwardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AwardServiceImpl extends BaseServiceImpl<Award> implements AwardService{

    private final AwardRepository awardRepository;

    @Override
    public JpaRepository<Award, Long> getRepository() {
        return awardRepository;
    }

    @Override
    public Award findByTitle(String title) {
        return awardRepository.findByTitle(title);
    }

    @Override
    public List<Award> findByCategory(String category) {
        return awardRepository.findByCategory(category);
    }
}
