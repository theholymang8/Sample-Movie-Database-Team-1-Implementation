package com.pfseven.smdb.smdb.projections;

import com.pfseven.smdb.smdb.domain.Film;
import com.pfseven.smdb.smdb.domain.Genre;

import java.time.LocalDate;

public interface ContentPerGenre {

    Genre getGenre();

    String getTitle();

    LocalDate getReleaseDate();

    String getDescription();

    Float getRating();

    Integer getLength();

}
