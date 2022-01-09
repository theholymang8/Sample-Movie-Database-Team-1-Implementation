package com.pfseven.smdb.smdb.services;

import com.pfseven.smdb.smdb.domain.Content;
import com.pfseven.smdb.smdb.domain.Film;
import com.pfseven.smdb.smdb.domain.Genre;
import com.pfseven.smdb.smdb.domain.TvShow;
import com.pfseven.smdb.smdb.projections.ContentPerGenre;

import java.util.List;
import java.util.Map;

public interface ContentService<T, ID> extends BaseService<T, Long>{

    List<T> findTopContent(Integer limit);

    Map<Genre, List<ContentPerGenre>> contentPerGenreForGivenIndividual(final String firstName, final String lastName);

}
