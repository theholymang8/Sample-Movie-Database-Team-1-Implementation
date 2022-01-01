package com.pfseven.smdb.smdb.repositories;

import com.pfseven.smdb.smdb.domain.Award;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AwardRepository extends JpaRepository<Award, Long> {

    Award findByTitle(String title);

    List<Award> findByCategory(String category);

}
