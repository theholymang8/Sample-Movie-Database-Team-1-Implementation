package com.pfseven.smdb.smdb.repositories;

import com.pfseven.smdb.smdb.domain.Genre;
import com.pfseven.smdb.smdb.domain.TvShow;
import com.pfseven.smdb.smdb.dto.CountPerYearReport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TvShowRepository extends JpaRepository<TvShow, Long> {

    TvShow findByTitle(String title);

    //Long exportTvShows(TvShow tvShow);

    List<TvShow> findByGenres(Genre genre);

    Integer countByGenres(Genre genre);

    @Query
    List<CountPerYearReport> countByYearAndGenres(Genre genre);


    //Query 7
    //List<TvShow> contentPerGenreForGivenIndividual(Long individualID);


}
