package com.pfseven.smdb.smdb.services;

import com.pfseven.smdb.smdb.domain.*;
import com.pfseven.smdb.smdb.projections.ContentPerGenre;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface FilmService extends ContentService<Film, Long>  {

    Film findByTitle(String title);

    //Export films to csv file
    //Long exportFilms(Film film);


    //Returns films for a given (or more) genre(s)
    List<Film> findByGenres(List<Genre> genres);

    Map<Genre, List<ContentPerGenre>> contentPerGenreForGivenIndividual(final String firstName, final String lastName);

    void addContentIndividual(Film film,  ContentIndividual contentIndividual);



}
