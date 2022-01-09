package com.pfseven.smdb.smdb.bootstrap;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.pfseven.smdb.smdb.base.AbstractLogComponent;
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

    //private final ContentIndividualService contentIndividualService;

    @Override
    public void run(String... args) throws Exception {

        //These services dont'w work properly yet
        //logger.info("Found one film with title 'Ran': {}", filmService.findByTitle("Ran"));
        //logger.info("Found these films with the given Genres: {}", filmService.findByGenres(List.of(Genre.Adventure)));

//        Film film = Film.builder()
//                .title("Schindler's List")
//                //Directors: Steven Spielberg
//                //Writers: Steven Zaillian
//                //Actors: Liam Neeson, Ralph Fiennes, Ben Kingsley
//                .description("In German-occupied Poland during World War II, industrialist Oskar Schindler gradually becomes concerned for his Jewish workforce after witnessing their persecution by the Nazis.")
//                .genres(Set.of(Genre.Biography, Genre.Drama, Genre.History))
//                .length(195)
//                .releaseDate(LocalDate.of(1994, 2, 4))
//                .rating(8.9f)
//                .countryOfOrigin("USA")
//                .language("English, Hebrew, German, Polish, Latin")
//                .budget(BigDecimal.valueOf(22000000))
//                .revenue(BigDecimal.valueOf(322161245))
//                //.individuals(Set.of(individuals.get(5), individuals.get(98), individuals.get(0), individuals.get(99), individuals.get(100)))
//                .build();

        //logger.info(film.getReleaseDate());
        ObjectMapper objectMapper = new ObjectMapper();


        //filmService.findByTitle("Raging Bull").getAwards().forEach(award -> logger.info("Raging Bull won this award: {}\n", award));
        //logger.info("Film from json encoding: {}",objectMapper.writeValueAsString(filmService.findByTitle("Raging Bull")));
        //objectMapper.writeValue(System.out, filmService.findByTitle("Raging Bull"));
        //objectMapper.writeValue(System.out, filmService.findByTitle("Raging Bull").getIndividuals());
        //filmService.findByTitle("Raging Bull").getIndividuals().forEach(individual -> {
        //    logger.info("Raging Bull has this individual involved: {}, {}, {}", individual.getFirstName(), individual.getLastName(), individual.getIndividualRole());
        //});
        //logger.info("Raging Bull has {} individuals involved.", (filmService.findByTitle("Raging Bull").getIndividuals().size()));

        //filmService.findByTitle("Ran");

        //logger.info("Awards: \n");
        //Set<Award> awardSet = filmService.findByTitle("Ran").getAwards();
        //logger.info("Is NulL?: {}", awardSet.isEmpty());
        //awardSet.forEach(award -> logger.info("Ran won this awards: {}", award));


        //filmService.findByTitle("Schindler's List").getContentIndividuals().forEach( contentIndividual -> logger.info("Has this individual: {}", contentIndividual.getIndividual()));
        //logger.info("Film from repo: {}", filmService.findByTitle("Schindler's List"));

        //Query 4
        //logger.info("War has: {}",filmService.findByGenres(List.of(Genre.War)));
        //filmService.findByGenres(List.of(Genre.Drama, Genre.Biography)).forEach(film_1 -> logger.info("This genre has this film: {}, {}, {}", film_1.getTitle(), film_1.getRating(), film_1.getGenres()));

        //logger.info("Shcindler's list has {} individuals associated with it.", filmService.findByTitle("Schindler's List").getContentIndividuals().size());

        //Query 2
        //logger.info("{} has {} content associated with him.",individualService.findByFirstNameAndLastName("Henry", "Thomas").getFirstName(), individualService.findByFirstNameAndLastName("Henry", "Thomas").getContentIndividual().size());
        //logger.info("Steven Spielberg has {} content associated with him.", individualService.findByFirstNameAndLastName("Steven", "Spielberg").getContentIndividual().size());
        //individualService.findByFirstNameAndLastName("Harrison","Ford").getContentIndividual().forEach( contentIndividual -> logger.info("This individual has played in this content: {} as {}", contentIndividual.getContent().getTitle(), contentIndividual.getContributingRole()));

        //individualService.findByFirstNameAndLastName("Steven", "Spielberg").getAwards().forEach(award -> logger.info("Steven Spielberg has won this award: {}", award.getTitle()));
        //Long i_id = individualService.findByFirstNameAndLastName("Steven", "Spielberg").getId();

        //individualService.findAllByFirstName("Stephen").forEach(individual -> logger.info("This individual: {}", individual));

        //individualService.findAllByIndividualRole(IndividualRole.Director).forEach(individual -> logger.info("{} {}", individual.getFirstName(), individual.getLastName()));

        //Query 3
        //individualService
                //.findByFirstNameAndIndividualRole("Liam", IndividualRole.Actor)
                //.forEach(individual -> individual.getContentIndividual()
                        //.forEach(contentIndividual -> logger.info("{} content : {}",contentIndividual.getIndividual().getFirstName(), contentIndividual.getContent())));


        //Query 5
        logger.info("Genre list: {} ", tvShowService.countByGenres(EnumSet.allOf(Genre.class)));

        //Query 6
        logger.info("Query 6:");
        tvShowService.countByYearAndGenres(EnumSet.allOf(Genre.class))
                .forEach((key,value)-> value
                        .forEach(queryReport -> logger.info("Num of shows per year: {} per genre: {} are: {}", queryReport.getYear(), key, queryReport.getCount()) ));

        individualService.findAllByNationality("British").forEach(individual -> {
            logger.info("{} {} is British   ", individual.getFirstName(), individual.getLastName());
        });

        logger.info("Result : {}", tvShowService.countByGenres(Set.of(Genre.Drama, Genre.Comedy)));


        //Query 7
        logger.info("Query 7");
        //filmService.contentPerGenreForGivenIndividual("Liam", "Neeson").forEach(content -> logger.info("{} / {}", content.getTitle(), content.getGenres()));
        filmService.contentPerGenreForGivenIndividual("Liam", "Neeson").forEach(contentPerGenreReport -> logger.info("Genre: {} / Title: {}",contentPerGenreReport.getGenre(),contentPerGenreReport.getTitle()));

        //tvShowService.countByGenres(Set.of(Genre.Drama, Genre.Comedy)).values().forEach(count -> {
        //    logger.info("{} has  tvShows", count);
        //});
        //logger.info("These are the films: {}", filmService.findByGenres(List.of(Genre.Drama, Genre.Biography)));
        //JsonEncoding json_film = getClass(JsonParser).;


        //logger.info("Top 10 Films: {}", filmService.findTopFilms(10));

        //Query 1
        //filmService.findTopFilms(10).forEach(film -> logger.info("{} with rating: {}", film.getTitle(), film.getRating()));
        //tvShowService.findTopTvShows(4).forEach(tvShow -> logger.info("{} with rating: {}", tvShow.getTitle(), tvShow.getRating()));
    }
}
