package com.pfseven.smdb.smdb.services;

import com.pfseven.smdb.smdb.domain.ContentIndividual;
import com.pfseven.smdb.smdb.domain.Film;
import com.pfseven.smdb.smdb.domain.Genre;
import com.pfseven.smdb.smdb.domain.TvShow;
import com.pfseven.smdb.smdb.dto.CountPerYearReport;
import com.pfseven.smdb.smdb.projections.ContentPerGenre;
import com.pfseven.smdb.smdb.repositories.ContentRepository;
import com.pfseven.smdb.smdb.repositories.FilmRepository;
import com.pfseven.smdb.smdb.repositories.TvShowRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class TvShowServiceImpl extends ContentServiceImpl<TvShow> implements TvShowService{

    private final TvShowRepository tvShowRepository;

    @Override
    public ContentRepository<TvShow, Long> getRepository() {
        return tvShowRepository;
    }

    @Override
    public TvShow findByTitle(String title) {
        return tvShowRepository.findByTitle(title);
    }

    @Override
    public List<TvShow> findByGenres(final List<Genre> genres) {
        List<TvShow> foundTvShows = new ArrayList<>();
        for(final Genre genre : genres){
            foundTvShows.addAll(tvShowRepository.findByGenres(genre));
        }
        return foundTvShows;
    }


    @Override
    public List<TvShow> findAllByGenre(final String firstName, final String lastName) {
        return null;
    }

    @Override
    public Map<Genre, Integer> countByGenres(final Set<Genre> genres){
        Map<Genre, Integer> map = new HashMap<>();
        for(final Genre genre : genres){
            Integer count = tvShowRepository.countByGenres(genre);
            map.put(genre, count);
        }
        return map;
    }

    @Override
    public Map<Genre, List<CountPerYearReport>> countByYearAndGenres(Set<Genre> genres){
        Map<Genre, List<CountPerYearReport>> map = new HashMap<>();
        for(final Genre genre : genres){
            List<CountPerYearReport> reports = tvShowRepository.countByYearAndGenres(genre);
            map.put(genre, reports);
        }
        return map;
    }


    @Override
    public void addContentIndividual(TvShow tvShow, ContentIndividual contentIndividual){

        tvShow.getContentIndividuals().add(contentIndividual);
    }
}
