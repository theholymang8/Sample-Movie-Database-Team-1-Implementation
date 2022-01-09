package com.pfseven.smdb.smdb.services;

import com.pfseven.smdb.smdb.domain.*;
import com.pfseven.smdb.smdb.repositories.FilmRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class FilmServiceImpl extends BaseServiceImpl<Film> implements FilmService{

    private final FilmRepository filmRepository;

    @Autowired
    private final IndividualService individualService;

    @Override
    public JpaRepository<Film, Long> getRepository() {
        return filmRepository;
    }

    @Override
    public Film findByTitle(String title) {
        return filmRepository.findByTitle(title);
    }

    @Override
    public List<Film> findTopFilms(Integer limit) {
        return filmRepository.findAll(PageRequest.of(0, limit, Sort.by(Sort.Direction.DESC, "rating"))).getContent();
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
    public List<Film> contentPerGenreForGivenIndividual(final String firstName, final String lastName) {
        Long individualID = individualService.findByFirstNameAndLastName(firstName,lastName).getId();
        return filmRepository.contentPerGenreForGivenIndividual(individualID);
    }

    @Override
    public void addContentIndividual(Film film,  ContentIndividual contentIndividual){
        //film.getContentIndividuals().add(
                //ContentIndividual.builder()
                //.content(film)
                //.individual(individual)
                //.contributingRole(individualRole)
                //.build());
        film.getContentIndividuals().add(contentIndividual);
        //logger.debug("content {} added to ContIndiv {}", film, contentIndividual);
    }
}
