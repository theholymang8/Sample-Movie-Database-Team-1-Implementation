package com.pfseven.smdb.smdb.services;

import com.pfseven.smdb.smdb.domain.ContentIndividual;
import com.pfseven.smdb.smdb.domain.Film;
import com.pfseven.smdb.smdb.domain.Genre;
import com.pfseven.smdb.smdb.domain.TvShow;
import com.pfseven.smdb.smdb.dto.CountPerYearReport;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface TvShowService extends ContentService<TvShow, Long> {

    TvShow findByTitle(String title);

    //List<TvShow> findByGenres(final List<Genre> genres);

    //List<TvShow> findTopTvShows(Integer limit);

    /** is this used? **/
    //List<TvShow> findAllByGenre(final String firstName, final String lastName);

    //Long exportTvShows(TvShow tvShow);

    Map<Genre, Integer> countByGenres(Set<Genre> genres);

    //Returns the number of shows per genre per year
    Map<Genre, List<CountPerYearReport>> countByYearAndGenres(Set<Genre> genres);

    //List<TvShow> contentPerGenreForGivenIndividual(Long individualID);

    void addContentIndividual(TvShow tvShow, ContentIndividual contentIndividual);
}
