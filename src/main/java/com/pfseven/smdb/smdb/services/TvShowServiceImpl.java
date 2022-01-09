package com.pfseven.smdb.smdb.services;

import com.pfseven.smdb.smdb.domain.ContentIndividual;
import com.pfseven.smdb.smdb.domain.Film;
import com.pfseven.smdb.smdb.domain.Genre;
import com.pfseven.smdb.smdb.domain.TvShow;
import com.pfseven.smdb.smdb.pojo.CountPerYearReport;
import com.pfseven.smdb.smdb.repositories.TvShowRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@RequiredArgsConstructor
public class TvShowServiceImpl extends BaseServiceImpl<TvShow> implements TvShowService{

    private final TvShowRepository tvShowRepository;

    @Override
    public JpaRepository<TvShow, Long> getRepository() {
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
    public Map<Genre, Long> countByGenres(final Set<Genre> genres){
        Map<Genre, Long> map = new HashMap<>();
        for(final Genre genre : genres){
            Long count = tvShowRepository.countByGenres(genre);
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
