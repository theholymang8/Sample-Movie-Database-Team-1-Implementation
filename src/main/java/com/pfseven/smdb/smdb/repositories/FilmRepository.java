package com.pfseven.smdb.smdb.repositories;

import com.pfseven.smdb.smdb.domain.Film;
import com.pfseven.smdb.smdb.domain.FilmUniverse;
import com.pfseven.smdb.smdb.domain.Genre;

import com.pfseven.smdb.smdb.projections.FilmProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FilmRepository extends JpaRepository<Film, Long> {

    Film findByTitle(String title);

    List<Film> findAllByFilmUniverse(FilmUniverse filmUniverse);

    List<Film> findByGenres(Genre genre);

    @Query(value = "SELECT * FROM FILMS", nativeQuery = true)
    List<FilmProjection> getFilms();


}
