package com.pfseven.smdb.smdb.services;

import com.pfseven.smdb.smdb.domain.Film;
import com.pfseven.smdb.smdb.domain.Genre;
import com.pfseven.smdb.smdb.domain.TvShow;

import java.util.List;
import java.util.Optional;

public interface FilmService extends BaseService<Film, Long>  {

    //Optional<Film> findMovieByTitle(String title);

    //Export films to csv file
    //Long exportFilms(Film film);

    //Return X high-rated content
    //List<Film> findTopFilms(Long X);

    //Returns films for a given genre
    //List<Film> findFilmsByGenre(Genre genre);



}
