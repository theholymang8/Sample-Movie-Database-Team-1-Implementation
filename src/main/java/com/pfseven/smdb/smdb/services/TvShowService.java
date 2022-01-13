package com.pfseven.smdb.smdb.services;

import com.pfseven.smdb.smdb.domain.ContentIndividual;
import com.pfseven.smdb.smdb.domain.Genre;
import com.pfseven.smdb.smdb.domain.TvShow;
import com.pfseven.smdb.smdb.dto.CountPerYearReport;
import com.pfseven.smdb.smdb.projections.TvShowProjection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface TvShowService extends ContentService<TvShow, Long> {

    TvShow findByTitle(String title);

    List<TvShow> findByGenres(final List<Genre> genres);

    Map<Genre, Integer> countByGenres(Set<Genre> genres);

    //Returns the number of shows per genre per year
    Map<Genre, List<CountPerYearReport>> countByYearAndGenres(Set<Genre> genres);

    void addContentIndividual(TvShow tvShow, ContentIndividual contentIndividual);

    List<TvShowProjection> getTvShows();

}
