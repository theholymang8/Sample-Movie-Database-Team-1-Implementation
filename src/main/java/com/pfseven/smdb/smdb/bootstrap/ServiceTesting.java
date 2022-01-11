package com.pfseven.smdb.smdb.bootstrap;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.pfseven.smdb.smdb.base.AbstractLogComponent;
import com.pfseven.smdb.smdb.domain.Award;
import com.pfseven.smdb.smdb.domain.Film;
import com.pfseven.smdb.smdb.domain.Genre;
import com.pfseven.smdb.smdb.domain.IndividualRole;
import com.pfseven.smdb.smdb.services.*;
import lombok.RequiredArgsConstructor;
import lombok.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

@Component
@RequiredArgsConstructor
@Profile("service-testing")
public class ServiceTesting extends AbstractLogComponent implements CommandLineRunner {

    private final AwardService awardService;
    private final FilmService filmService;
    private final TvShowService tvShowService;
    private final IndividualService individualService;


    @Override
    public void run(String... args)  {

        //ObjectMapper objectMapper = new ObjectMapper();
        //filmService.findByTitle("Raging Bull").getAwards().forEach(award -> logger.info("Raging Bull won this award: {}\n", award));
        //logger.info("Film from json encoding: {}",objectMapper.writeValueAsString(filmService.findByTitle("Raging Bull")));
        //objectMapper.writeValue(System.out, filmService.findByTitle("Raging Bull"));
        //objectMapper.writeValue(System.out, filmService.findByTitle("Raging Bull").getIndividuals());
        //filmService.findByTitle("Raging Bull").getIndividuals().forEach(individual -> {
        //    logger.info("Raging Bull has this individual involved: {}, {}, {}", individual.getFirstName(), individual.getLastName(), individual.getIndividualRole());
        //});
        //logger.info("Raging Bull has {} individuals involved.", (filmService.findByTitle("Raging Bull").getIndividuals().size()));


        //Query 1
        logger.info("**Query 1**");
        filmService.findTopContent(10).forEach(film -> logger.info("{} with rating: {}", film.getTitle(), film.getRating()));
        tvShowService.findTopContent(4).forEach(tvShow -> logger.info("{} with rating: {}", tvShow.getTitle(), tvShow.getRating()));

        //Query 2
        logger.info("**Query 2**");
        logger.info("{} has {} content associated with him.",individualService.findByFirstNameAndLastName("Henry", "Thomas").getFirstName(), individualService.findByFirstNameAndLastName("Henry", "Thomas").getContentIndividuals().size());
        logger.info("Steven Spielberg has {} content associated with him.", individualService.findByFirstNameAndLastName("Steven", "Spielberg").getContentIndividuals().size());
        individualService.findByFirstNameAndLastName("Harrison","Ford").getContentIndividuals()
                .forEach( contentIndividual -> logger.info("Individual {} {} has played in this content: {} as {}", contentIndividual.getIndividual().getFirstName(), contentIndividual.getIndividual().getLastName(), contentIndividual.getContent().getTitle(), contentIndividual.getContributingRole()));
        individualService.findByFirstNameAndLastName("Steven", "Spielberg").getAwards().forEach(award -> logger.info("Steven Spielberg has won this award: {}", award.getTitle()));

        //Query 3
        logger.info("**Query 3**");
        //Integer res = individualService.findIndividualByContributingRole("Liam", "Neeson", IndividualRole.Actor).size();
        //logger.info("Size is: {}", res);
        //individualService.findIndividualByContributingRole("Tom", "Hanks", IndividualRole.Actor)
        //        .forEach(individual -> logger.info("TOM has these content as ACTOR: {}", individual.getContent().getTitle()));
        //.forEach(contentIndividual -> logger.info("TOM has these content as DIRECTOR: {}", contentIndividual.getContent().getTitle())));

        //Query 4
        logger.info("**Query 4**");
        filmService.findByGenres(List.of(Genre.Drama, Genre.Biography)).forEach(film -> logger.info("This genre has this film: {}, {}, {}", film.getTitle(), film.getRating(), film.getGenres()));

        //Query 5
        logger.info("**Query 5**");
        logger.info("Genre list: {} ", tvShowService.countByGenres(EnumSet.allOf(Genre.class)));
        logger.info("Result : {}", tvShowService.countByGenres(Set.of(Genre.Drama, Genre.Comedy)));

        //Query 6
        logger.info("**Query 6**");
        tvShowService.countByYearAndGenres(EnumSet.allOf(Genre.class))
                .forEach((key,value)-> value
                        .forEach(queryReport -> logger.info("Num of shows per year: {} per genre: {} are: {}", queryReport.getYear(), key, queryReport.getCount()) ));


        //Query 7 (it returns all content(films and shows))
        logger.info("**Query 7**");
        tvShowService.contentPerGenreForGivenIndividual("Tom", "Hanks").forEach((genre, contentPerGenres) -> {
            logger.info("{} has these films:", genre);
            contentPerGenres.forEach(content -> logger.info("{}", content.getTitle()));
        });

        //Award query
        logger.info("**Awards**");
        Set<Award> awardSet = filmService.findByTitle("Ran").getAwards();
        logger.info("Is NulL?: {}", awardSet.isEmpty());
        awardSet.forEach(award -> logger.info("Ran won this awards: {}", award));

        //Find Individuals by nationality
        logger.info("**Find Individuals by nationality**");
        individualService.findAllByNationality("Polish").forEach(individual -> logger.info("{} {} is Polish   ", individual.getFirstName(), individual.getLastName()));

        //Search Film
        logger.info("**Search Film**");
        filmService.findByTitle("Schindler's List").getContentIndividuals().forEach( contentIndividual -> logger.info("Has this individual: {}", contentIndividual.getIndividual()));
        logger.info("Shcindler's list has {} individuals associated with it.", filmService.findByTitle("Schindler's List").getContentIndividuals().size());


        //Find by FirstName only
        logger.info("**Find by FirstName**");
        individualService.findAllByFirstName("Stephen").forEach(individual -> logger.info("This individual: {}", individual));

        //Find Individuals by IndividualRole
        logger.info("**Find Individuals by IndividualRole**");
        individualService.findAllByIndividualRole(IndividualRole.Director).forEach(individual -> logger.info("{} {}", individual.getFirstName(), individual.getLastName()));

        logger.info("{}", individualService.findByFirstNameAndLastName("Tom", "Hanks"));

    }
}
