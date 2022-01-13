package com.pfseven.smdb.smdb.repositories;

import com.pfseven.smdb.smdb.domain.Genre;
import com.pfseven.smdb.smdb.domain.TvShow;
import com.pfseven.smdb.smdb.dto.CountPerYearReport;
import com.pfseven.smdb.smdb.projections.TvShowProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TvShowRepository extends JpaRepository<TvShow, Long> {

    TvShow findByTitle(String title);

    List<TvShow> findByGenres(Genre genre);

    Integer countByGenres(Genre genre);

    @Query
    List<CountPerYearReport> countByYearAndGenres(Genre genre);

    @Query(value = "SELECT * FROM TV_SHOWS", nativeQuery = true)
    List<TvShowProjection> getTvShows();

}
