package com.pfseven.smdb.smdb.repositories;


import com.pfseven.smdb.smdb.domain.Film;
import com.pfseven.smdb.smdb.domain.Genre;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FilmRepository extends JpaRepository<Film, Long> {

    Film findByTitle(String title);

    //List<Film> findByGenres(Genre genre);

    //Long exportFilms(Film film);


}
