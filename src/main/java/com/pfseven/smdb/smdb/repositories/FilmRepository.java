package com.pfseven.smdb.smdb.repositories;

import com.pfseven.smdb.smdb.domain.Film;
import com.pfseven.smdb.smdb.domain.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface FilmRepository extends JpaRepository<Film, Long> {

    Optional<Film> findByTitle(String title);

    Long exportFilms(Film film);

    List<Film> findTop10ByOrderByRatingDesc();

    List<Film> findByGenre(Genre genre);

}
