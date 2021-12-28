package com.pfseven.smdb.smdb.services;

import com.pfseven.smdb.smdb.domain.Genre;
import com.pfseven.smdb.smdb.domain.TvShow;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface TvShowService extends BaseService<TvShow, Long> {

    //Optional<TvShow> findTvShowByTitle(String title);

    //Long exportTvShows(TvShow tvShow);

    //Return X high-rated content
    //List<TvShow> findTopTvShows(Long X);

    //Returns TvShows for a given genre
    //List<TvShow> findTvShowsByGenre(Genre genre);

    //Returns the number of shows per genre
    //Long numOfTvShowsPerGenre(Genre genre);

    //Map<Long, Long> numOfTvShowsPerYearPerGenre();
}
