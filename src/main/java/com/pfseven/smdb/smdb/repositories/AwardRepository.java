package com.pfseven.smdb.smdb.repositories;

import com.pfseven.smdb.smdb.domain.Award;
import com.pfseven.smdb.smdb.projections.AwardProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AwardRepository extends JpaRepository<Award, Long> {

    Award findByTitle(String title);

    List<Award> findByCategory(String category);

    List<Award> findByYearOfAward(String yearOfAward);

    @Query(value="select ID, CATEGORY, TITLE, YEAROFAWARD, CONTENT_ID, INDIVIDUAL_ID from AWARDS", nativeQuery = true)// CONTENT_ID, INDIVIDUAL_ID
    List<AwardProjection> getAwardsInfo();

}
