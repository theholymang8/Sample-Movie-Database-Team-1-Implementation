package com.pfseven.smdb.smdb.services;

import com.pfseven.smdb.smdb.domain.*;
import com.pfseven.smdb.smdb.projections.FilmProjection;

import java.util.List;

public interface FilmService extends ContentService<Film, Long>  {

    Film findByTitle(String title);

    List<Film> findByUniverse(FilmUniverse filmUniverse);

    //Returns films for a given (or more) genre(s)
    List<Film> findByGenres(List<Genre> genres);

    void addContentIndividual(Film film,  ContentIndividual contentIndividual);

    List<FilmProjection> getFilms();

}
