package com.pfseven.smdb.smdb.services;

import com.pfseven.smdb.smdb.domain.ContentIndividual;
import com.pfseven.smdb.smdb.domain.Film;
import com.pfseven.smdb.smdb.domain.Genre;
import com.pfseven.smdb.smdb.domain.TvShow;
import com.pfseven.smdb.smdb.dto.CountPerYearReport;
import com.pfseven.smdb.smdb.projections.ContentPerGenre;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface TvShowService extends ContentService<TvShow, Long> {

    TvShow findByTitle(String title);

    //Returns TvShows for a given genre
    List<TvShow> findByGenres(final List<Genre> genres);

    List<TvShow> findAllByGenre(final String firstName, final String lastName);

    //Long exportTvShows(TvShow tvShow);

    //Returns the number of shows per genre
    Map<Genre, Integer> countByGenres(Set<Genre> genres);

    Map<Genre, List<CountPerYearReport>> countByYearAndGenres(Set<Genre> genres);

    void addContentIndividual(TvShow tvShow, ContentIndividual contentIndividual);
}
