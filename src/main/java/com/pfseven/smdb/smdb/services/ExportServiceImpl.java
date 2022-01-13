package com.pfseven.smdb.smdb.services;

import com.pfseven.smdb.smdb.base.AbstractLogComponent;
import com.pfseven.smdb.smdb.projections.*;
import lombok.RequiredArgsConstructor;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.springframework.stereotype.Service;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ExportServiceImpl extends AbstractLogComponent implements ExportService {

    private final IndividualService individualService;
    private final AwardService awardService;
    private final FilmService filmService;
    private final TvShowService tvShowService;
    private final ContentService contentService;

    @Override
    public Long exportAwards() {

        List<AwardProjection> awards = awardService.getAwards();

        try (CSVPrinter csvPrinter = new CSVPrinter(new FileWriter("./src/main/resources/backup/award.csv"), CSVFormat.DEFAULT)) {

            String[] csvHeader = {"ID", "CATEGORY", "TITLE", "YEAROFAWARD", "CONTENT_ID", "INDIVIDUAL_ID"};
            csvPrinter.printRecord(csvHeader);

            for (AwardProjection award : awards) {
                csvPrinter.printRecord(award.getId(),
                        award.getCategory(),
                        award.getTitle(),
                        award.getYearOfAward(),
                        award.getCONTENT_ID(),
                        award.getINDIVIDUAL_ID());
            }
            logger.info("No problem with path");
            return (long) awards.size();

        } catch (IOException e) {
            logger.error("There was an error with the content_genres csv creation");
        }
        return 0L;
    }

    @Override
    public Long exportContentGenre() {

        List<ContentGenreProjection> contentGenreProjections = individualService.getContentGenre();

        try (CSVPrinter csvPrinter = new CSVPrinter(new FileWriter("./src/main/resources/backup/content_genre.csv"), CSVFormat.DEFAULT)) {

            String[] csvHeader = {"CONTENT_ID", "GENRE"};
            csvPrinter.printRecord(csvHeader);

            for (ContentGenreProjection contentGenreProjection : contentGenreProjections) {
                csvPrinter.printRecord(contentGenreProjection.getCONTENT_ID(), contentGenreProjection.getGenre());
            }
            logger.info("No problem with path");
            return (long) contentGenreProjections.size();

        } catch (IOException e) {
            logger.error("There was an error with the content_genres csv creation");
        }
        return 0L;
    }


    @Override
    public Long exportFilms() {

        List<FilmProjection> films = filmService.getFilms();

        try (CSVPrinter csvPrinter = new CSVPrinter(new FileWriter("./src/main/resources/backup/film.csv"), CSVFormat.DEFAULT)) {

            String[] csvHeader = {"FILMUNIVERSE", "ID"};
            csvPrinter.printRecord(csvHeader);

            for (FilmProjection film : films) {
                csvPrinter.printRecord(film.getId(),film.getFilmUniverse());
            }
            logger.info("No problem with path");
            return (long) films.size();

        } catch (IOException e) {
            logger.error("There was an error with the content_genres csv creation");
        }
        return 0L;
    }

    @Override
    public Long exportTvShows(){

        List<TvShowProjection> tvShows = tvShowService.getTvShows();

        try (CSVPrinter csvPrinter = new CSVPrinter(new FileWriter("./src/main/resources/backup/tvshow.csv"), CSVFormat.DEFAULT)) {

            String[] csvHeader = {"EPISODES", "SEASONS", "ID"};
            csvPrinter.printRecord(csvHeader);

            for (TvShowProjection tvShow : tvShows) {
                csvPrinter.printRecord(tvShow.getId(),
                        tvShow.getEpisodes(),
                        tvShow.getSeasons());
            }
            logger.info("No problem with path");
            return (long) tvShows.size();

        } catch (IOException e) {
            logger.error("There was an error with the content_genres csv creation");
        }
        return 0L;
    }

    @Override
    public Long exportContentIndividuals() {

        List<ContentIndividualProjection> contentIndividuals = individualService.getContentIndividuals();

        try (CSVPrinter csvPrinter = new CSVPrinter(new FileWriter("./src/main/resources/backup/content_individual.csv"), CSVFormat.DEFAULT)) {

            String[] csvHeader = {"ID", "CONTRIBUTINGROLE", "CONTENT_ID", "INDIVIDUAL_ID"};
            csvPrinter.printRecord(csvHeader);

            for (ContentIndividualProjection contentIndividual : contentIndividuals) {
                csvPrinter.printRecord(contentIndividual.getId(),
                        contentIndividual.getContributingRole(),
                        contentIndividual.getContent_ID(),
                        contentIndividual.getIndividual_ID());
            }
            logger.info("No problem with path");
            return (long) contentIndividuals.size();

        } catch (IOException e) {
            logger.error("There was an error with the content_genres csv creation");
        }
        return 0L;
    }


    @Override
    public Long exportContent() {

        List<ContentProjection> contents = contentService.getContents();

        try (CSVPrinter csvPrinter = new CSVPrinter(new FileWriter("./src/main/resources/backup/content.csv"), CSVFormat.DEFAULT)) {

            String[] csvHeader = {"ID", "BUDGET", "COUNTRYOFORIGIN", "DESCRIPTION", "LANGUAGE", "LENGTH", "RATING", "RELEASEDATE", "REVENUE", "TITLE"};
            csvPrinter.printRecord(csvHeader);

            for (ContentProjection content : contents) {
                csvPrinter.printRecord(content.getId(),
                        content.getBudget(),
                        content.getCountryOfOrigin(),
                        content.getDescription(),
                        content.getLanguage(),
                        content.getLength(),
                        content.getRating(),
                        content.getReleaseDate(),
                        content.getRevenue(),
                        content.getTitle());
            }
            logger.info("No problem with path");
            return (long) contents.size();

        } catch (IOException e) {
            logger.error("There was an error with the content_genres csv creation");
        }
        return 0L;
    }

    @Override
    public Long exportIndividuals() {

        List<IndividualProjection> individualInfos = individualService.getIndividuals();

        try (CSVPrinter csvPrinter = new CSVPrinter(new FileWriter("./src/main/resources/backup/individual.csv"), CSVFormat.DEFAULT)) {

            String[] csvHeader = {"ID", "AGE", "EMAIL", "FIRSTNAME", "LASTNAME", "NATIONALITY"};
            csvPrinter.printRecord(csvHeader);

            for (IndividualProjection individualInfo : individualInfos) {
                csvPrinter.printRecord(individualInfo.getId(),
                        individualInfo.getAge(),
                        individualInfo.getEmail(),
                        individualInfo.getFirstName(),
                        individualInfo.getLastName(),
                        individualInfo.getNationality());
            }
            logger.info("No problem with path");
            return (long) individualInfos.size();

        } catch (IOException e) {
            logger.error("There was an error with the content_genres csv creation");
        }
        return 0L;
    }

    @Override
    public Long exportIndividualRole() {

        List<IndividualRoleProjection> individualRoles = individualService.getIndividualRole();

        try (CSVPrinter csvPrinter = new CSVPrinter(new FileWriter("./src/main/resources/backup/individual_role.csv"), CSVFormat.DEFAULT)) {

            String[] csvHeader = {"INDIVIDUAL_ID", "ROLE"};
            csvPrinter.printRecord(csvHeader);

            for (IndividualRoleProjection individualRole : individualRoles) {
                csvPrinter.printRecord(individualRole.getINDIVIDUAL_ID(),
                        individualRole.getRole());
            }
            logger.info("No problem with path");
            return (long) individualRoles.size();

        } catch (IOException e) {
            logger.error("There was an error with the content_genres csv creation");
        }
        return 0L;
    }
}
