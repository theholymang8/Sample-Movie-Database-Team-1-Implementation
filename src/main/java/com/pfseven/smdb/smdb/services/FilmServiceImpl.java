package com.pfseven.smdb.smdb.services;

import com.pfseven.smdb.smdb.domain.*;
import com.pfseven.smdb.smdb.projections.ContentGenre;
import com.pfseven.smdb.smdb.repositories.FilmRepository;
import lombok.RequiredArgsConstructor;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
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
    public Long exportFilms() {
        List<Film> films = filmRepository.findAll();
        logger.trace("These films are getting exported: {}", films);
        try (CSVPrinter csvPrinter = new CSVPrinter(new FileWriter("films.csv"), CSVFormat.DEFAULT)) {
            for (Film film : films) {
                csvPrinter.printRecord(film);
            }
            return (long) films.size();
        } catch (IOException e) {
            logger.error("There was an error with the content_genres csv creation");
        }
        return null;
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

}
