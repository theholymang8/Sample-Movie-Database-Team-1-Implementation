package com.pfseven.smdb.smdb.services;

import com.pfseven.smdb.smdb.domain.BaseModel;
import com.pfseven.smdb.smdb.domain.Content;
import com.pfseven.smdb.smdb.domain.Genre;
import com.pfseven.smdb.smdb.projections.ContentPerGenre;
import com.pfseven.smdb.smdb.repositories.ContentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
@Component
public abstract class ContentServiceImpl<T extends BaseModel> extends BaseServiceImpl<T> implements ContentService<T, Long> {

    @Deprecated
    @Autowired
    private ContentRepository contentRepository;

    //Service Field Injection
    @Deprecated
    @Autowired
    private IndividualService individualService;

    public abstract JpaRepository<T, Long> getRepository();


    @Override
    public List<T> findTopContent(Integer limit) {
        return getRepository().findAll(PageRequest.of(0, limit, Sort.by(Sort.Direction.DESC, "rating"))).getContent();
    }

    @Override
    public Map<Genre, List<ContentPerGenre>> contentPerGenreForGivenIndividual(final String firstName, final String lastName) {
        Long individualID = individualService.findByFirstNameAndLastName(firstName,lastName).getId();
        if (individualID == null){
            logger.info("{} {} could not be found", firstName, lastName);
            return null;
        }
        List<ContentPerGenre>reports = contentRepository.contentPerGenreForGivenIndividual(individualID);
        return reports.stream()
                .collect(Collectors.groupingBy(ContentPerGenre::getGenre));
    }

    @Override
    public List<Content> findByGenres(List<Genre> genres) {
        List<Content> foundFilms = new ArrayList<>();
        for(final Genre genre : genres){
            foundFilms.addAll(contentRepository.findByGenres(genre));
        }
        return foundFilms;
    }

}
