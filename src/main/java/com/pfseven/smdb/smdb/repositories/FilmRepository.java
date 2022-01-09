package com.pfseven.smdb.smdb.repositories;


import com.pfseven.smdb.smdb.domain.Film;
import com.pfseven.smdb.smdb.domain.Genre;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FilmRepository extends JpaRepository<Film, Long> {

    Film findByTitle(String title);

    List<Film> findByGenres(Genre genre);

    //Long exportFilms(Film film);

    //Query 7
    //@Query("select c from ContentIndividual ci join ci.content c  join c.genres g where ci.id=?1 group by g")


}
