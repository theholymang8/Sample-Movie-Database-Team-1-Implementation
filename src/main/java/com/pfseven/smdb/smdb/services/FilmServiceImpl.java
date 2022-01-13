package com.pfseven.smdb.smdb.services;

import com.pfseven.smdb.smdb.domain.*;
import com.pfseven.smdb.smdb.projections.FilmProjection;
import com.pfseven.smdb.smdb.repositories.FilmRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Primary
@RequiredArgsConstructor
public class FilmServiceImpl extends ContentServiceImpl<Film> implements FilmService{

    private final FilmRepository filmRepository;

    @Override
    public JpaRepository<Film, Long> getRepository() {
        return filmRepository;
    }

    @Override
    public Film findByTitle(String title) {
        logger.info("found film by title {}", title);
        return filmRepository.findByTitle(title);
    }

    @Override
    public List<Film> findByUniverse(FilmUniverse filmUniverse) {
        logger.info("found films by film universe {}", filmUniverse);
        return filmRepository.findAllByFilmUniverse(filmUniverse);
    }

    @Override
    public List<Film> findByGenres(List<Genre> genres) {
        List<Film> foundFilms = new ArrayList<>();
        for(final Genre genre : genres){
            foundFilms.addAll(filmRepository.findByGenres(genre));
        }
        logger.info("found films by genres {}", genres);
        return foundFilms;
    }

    @Override
    public void addContentIndividual(Film film,  ContentIndividual contentIndividual){
        film.getContentIndividuals().add(contentIndividual);
    }

    @Override
    public List<FilmProjection> getFilms(){
        return filmRepository.getFilms();
    }

}
