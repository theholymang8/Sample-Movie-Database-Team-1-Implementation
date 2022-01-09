package com.pfseven.smdb.smdb.repositories;

import com.pfseven.smdb.smdb.domain.Content;
import com.pfseven.smdb.smdb.projections.ContentPerGenre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ContentRepository<T, ID> extends JpaRepository<Content, Long> {

    @Query(value="select CG.GENRE, C.TITLE, C.RELEASEDATE, C.DESCRIPTION, C.RATING, C.LENGTH  from CONTENT_INDIVIDUALS CI\n" +
            "                                    join CONTENTS C on CI.CONTENT_ID = C.ID\n" +
            "                                    join CONTENT_GENRE CG on C.ID = CG.CONTENT_ID\n" +
            "                                    where CI.INDIVIDUAL_ID=?1 \n" +
            "                                    group by CG.GENRE, C.TITLE, CG.GENRE, C.RELEASEDATE, C.DESCRIPTION, C.RATING, C.LENGTH", nativeQuery = true)
    List<ContentPerGenre> contentPerGenreForGivenIndividual(Long individualID);
}
