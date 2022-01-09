package com.pfseven.smdb.smdb.repositories;

import com.pfseven.smdb.smdb.domain.Content;
import com.pfseven.smdb.smdb.projections.ContentPerGenre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ContentRepository extends JpaRepository<Content, Long> {

    @Query(nativeQuery = true)
    List<ContentPerGenre> contentPerGenreForGivenIndividual(Long individualID);
}
