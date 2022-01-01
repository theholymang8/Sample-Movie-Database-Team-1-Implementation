package com.pfseven.smdb.smdb.repositories;

import com.pfseven.smdb.smdb.domain.Film;
import com.pfseven.smdb.smdb.domain.Genre;
import com.pfseven.smdb.smdb.domain.TvShow;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface TvShowRepository extends JpaRepository<TvShow, Long> {

    TvShow findByTitle(String title);

    //Long exportTvShows(TvShow tvShow);

    //List<TvShow> findTop10ByOrderByRatingDesc();

    @Query(value = "SELECT CONTENT.*, TV.EPISODES, SEASONS\n" +
            "FROM\n" +
            "(SELECT C.*, CONTENT.GENRE\n" +
            "FROM(SELECT * FROM CONTENT_GENRE WHERE GENRE = ?) AS CONTENT\n" +
            "INNER JOIN CONTENTS C ON CONTENT.CONTENT_ID = C.ID) AS CONTENT\n" +
            "INNER JOIN TV_SHOWS TV ON CONTENT.ID=TV.ID;", nativeQuery = true)
    List<TvShow> findByGenre(Genre genre);

}
