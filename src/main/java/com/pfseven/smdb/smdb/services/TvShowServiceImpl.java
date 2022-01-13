package com.pfseven.smdb.smdb.services;

import com.pfseven.smdb.smdb.domain.ContentIndividual;
import com.pfseven.smdb.smdb.domain.Genre;
import com.pfseven.smdb.smdb.domain.TvShow;
import com.pfseven.smdb.smdb.dto.CountPerYearReport;
import com.pfseven.smdb.smdb.projections.TvShowProjection;
import com.pfseven.smdb.smdb.repositories.TvShowRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@RequiredArgsConstructor
public class TvShowServiceImpl extends ContentServiceImpl<TvShow> implements TvShowService{

    private final TvShowRepository tvShowRepository;

    @Override
    public JpaRepository<TvShow, Long> getRepository() { return tvShowRepository; }

    @Override
    public TvShow findByTitle(String title) {
        return tvShowRepository.findByTitle(title);
    }

    @Override
    public List<TvShow> findByGenres(List<Genre> genres) {
        List<TvShow> foundFilms = new ArrayList<>();
        for(final Genre genre : genres){
            foundFilms.addAll(tvShowRepository.findByGenres(genre));
        }
        return foundFilms;
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

    @Override
    public List<TvShowProjection> getTvShows(){
        return tvShowRepository.getTvShows();
    }


}
