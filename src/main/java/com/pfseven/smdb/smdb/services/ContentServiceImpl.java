package com.pfseven.smdb.smdb.services;

import com.pfseven.smdb.smdb.domain.BaseModel;
import com.pfseven.smdb.smdb.domain.Content;
import com.pfseven.smdb.smdb.domain.Film;
import com.pfseven.smdb.smdb.domain.Genre;
import com.pfseven.smdb.smdb.projections.ContentPerGenre;
import com.pfseven.smdb.smdb.repositories.ContentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
@Component
public abstract class ContentServiceImpl<T extends BaseModel> extends BaseServiceImpl<T> implements ContentService<T, Long> {

    @Autowired
    private IndividualService individualService;


    public abstract ContentRepository<T, Long> getRepositoryCo();

    @Override
    public List<T> findTopContent(Integer limit)
    {
        //List<T> topContent = (List<T>) getRepositoryCo().findAll(PageRequest.of(0, limit, Sort.by(Sort.Direction.DESC, "rating"))).getContent();
        return (List<T>) getRepositoryCo().findAll(PageRequest.of(0, limit, Sort.by(Sort.Direction.DESC, "rating"))).getContent();
    }

    @Override
    public Map<Genre, List<ContentPerGenre>> contentPerGenreForGivenIndividual(final String firstName, final String lastName) {
        Long individualID = individualService.findByFirstNameAndLastName(firstName,lastName).getId();
        if (individualID == null){
            logger.info("This person is not found!");
            return null;
        }
        logger.info("individualID is {}",individualID);
        List<ContentPerGenre>reports = getRepositoryCo().contentPerGenreForGivenIndividual(individualID);
        Map<Genre, List<ContentPerGenre>> byGenre = reports.stream()
                .collect(Collectors.groupingBy(ContentPerGenre::getGenre));
        return byGenre;
        //return filmRepository.contentPerGenreForGivenIndividual(individualID);
    }

}
