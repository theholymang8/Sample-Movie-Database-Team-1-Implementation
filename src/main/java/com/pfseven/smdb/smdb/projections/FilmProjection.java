package com.pfseven.smdb.smdb.projections;

import com.pfseven.smdb.smdb.domain.FilmUniverse;

public interface FilmProjection {

    FilmUniverse getFilmUniverse();

    Long getId();
}
