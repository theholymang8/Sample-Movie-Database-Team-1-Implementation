package com.pfseven.smdb.smdb.repositories;

import com.pfseven.smdb.smdb.domain.Film;
import com.pfseven.smdb.smdb.domain.Genre;
import com.pfseven.smdb.smdb.domain.TvShow;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public interface TvShowRepository extends JpaRepository<TvShow, Long> {

    TvShow findByTitle(String title);

    //Long exportTvShows(TvShow tvShow);

    //List<TvShow> findTop10ByOrderByRatingDesc();

    List<TvShow> findByGenres(Genre genre);

    Long countByGenres(Genre genre);

}
