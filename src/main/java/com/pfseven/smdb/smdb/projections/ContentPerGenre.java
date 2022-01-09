package com.pfseven.smdb.smdb.projections;

import com.pfseven.smdb.smdb.domain.Genre;

public interface ContentPerGenre {

    Genre getGenre();

    String getTitle();

}
