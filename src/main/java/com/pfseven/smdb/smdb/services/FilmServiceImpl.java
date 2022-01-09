package com.pfseven.smdb.smdb.services;

import com.pfseven.smdb.smdb.domain.*;
import com.pfseven.smdb.smdb.repositories.FilmRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

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
        return filmRepository.findByTitle(title);
    }

    @Override
    public List<Film> findByGenres(List<Genre> genres) {
        List<Film> foundFilms = new ArrayList<>();
        for(final Genre genre : genres){
            foundFilms.addAll(filmRepository.findByGenres(genre));
        }
        return foundFilms;
    }

    @Override
    public void addContentIndividual(Film film,  ContentIndividual contentIndividual){
        film.getContentIndividuals().add(contentIndividual);
    }


}
