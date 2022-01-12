package com.pfseven.smdb.smdb.repositories;

import com.pfseven.smdb.smdb.domain.Content;
import com.pfseven.smdb.smdb.projections.ContentGenre;
import com.pfseven.smdb.smdb.projections.ContentPerGenre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ContentRepository extends JpaRepository<Content, Long> {

    @Query(nativeQuery = true)
    List<ContentPerGenre> contentPerGenreForGivenIndividual(Long individualID);

    @Query(value = "SELECT CONTENT_ID, GENRE" +
                    "  FROM CONTENT_GENRE", nativeQuery = true)
    List<ContentGenre> exportContentGenre();

}
