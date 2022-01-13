package com.pfseven.smdb.smdb.services;

import com.pfseven.smdb.smdb.domain.Genre;
import com.pfseven.smdb.smdb.projections.ContentPerGenreReport;
import com.pfseven.smdb.smdb.projections.ContentProjection;

import java.util.List;
import java.util.Map;

public interface ContentService<T, ID> extends BaseService<T, Long>{

    List<T> findTopContent(Integer limit);

    Map<Genre, List<ContentPerGenreReport>> contentPerGenreForGivenIndividual(final String firstName, final String lastName);

    List<ContentProjection> getContents();

}
