package com.pfseven.smdb.smdb.repositories;

import com.pfseven.smdb.smdb.domain.ContentIndividual;
import com.pfseven.smdb.smdb.domain.Genre;
import com.pfseven.smdb.smdb.domain.TvShow;
import com.pfseven.smdb.smdb.dto.CountPerYearReport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TvShowRepository extends JpaRepository<TvShow, Long> {

    TvShow findByTitle(String title);

    //Long exportTvShows(TvShow tvShow);

    //List<TvShow> findTop10ByOrderByRatingDesc();

    List<TvShow> findByGenres(Genre genre);

    /**
     * Experimental
     * DEVELOPMENT
     */

    List<TvShow> findAllByContentIndividualsContainsOrderByGenres(ContentIndividual contentIndividual);

    Integer countByGenres(Genre genre);

    @Query("SELECT new com.pfseven.smdb.smdb.dto.CountPerYearReport(COUNT(tv), SUBSTRING(tv.releaseDate , 1, 4))" +
            "FROM TvShow tv INNER JOIN tv.genres genre " +
            "WHERE genre IN (?1)" +
            "group by SUBSTRING(tv.releaseDate , 1, 4)" )
    List<CountPerYearReport> countByYearAndGenres(Genre genre);

    //Query 7
    //List<TvShow> contentPerGenreForGivenIndividual(Long individualID);


}
