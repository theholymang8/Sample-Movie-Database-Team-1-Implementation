package com.pfseven.smdb.smdb.repositories;

import com.pfseven.smdb.smdb.domain.Film;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmRepository extends JpaRepository<Film, Long> {
}
