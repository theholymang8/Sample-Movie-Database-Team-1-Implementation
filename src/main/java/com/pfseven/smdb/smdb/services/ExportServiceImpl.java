package com.pfseven.smdb.smdb.services;

import com.pfseven.smdb.smdb.base.AbstractLogComponent;
import com.pfseven.smdb.smdb.domain.Award;
import com.pfseven.smdb.smdb.domain.Content;
import com.pfseven.smdb.smdb.domain.Film;
import com.pfseven.smdb.smdb.domain.Individual;
import com.pfseven.smdb.smdb.projections.ContentGenre;
import com.pfseven.smdb.smdb.projections.ContentIndividual;
import com.pfseven.smdb.smdb.projections.IndividualRoleProjection;
import com.pfseven.smdb.smdb.repositories.ExportRepository;
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


    private final ExportRepository exportRepository;
    //private final ContentService contentService;

    @Override
    public Long exportAwards() {
        List<Award> awards = exportRepository.exportAwards();
        logger.info("{}", awards);
        try (CSVPrinter csvPrinter = new CSVPrinter(new FileWriter("./resources/backup/awards.csv"), CSVFormat.DEFAULT)) {
            for (Award award : awards) {
                csvPrinter.printRecord(award.getId(), award.getCategory(), award.getYearOfAward(), award.getContent().getId(), award.getIndividual().getId());
            }

            return (long) awards.size();
        } catch (IOException e) {
            logger.error("There was an error with the awards csv creation");
        }
        return 0L;
    }

    @Override
    public Long exportContentGenre() {
        return null;
    }

    /*@Override
    public Long exportContentGenre() {
        List<ContentGenre> contentGenres = contentService.();
        logger.info("{}", contentGenres);
        try (CSVPrinter csvPrinter = new CSVPrinter(new FileWriter("awards.csv"), CSVFormat.DEFAULT)) {
            for (ContentGenre contentGenre : contentGenres) {
                csvPrinter.printRecord(contentGenre.getGenre());
            }

            //contentGenres.forEach(contentGenre -> csvPrinter.printRecord(contentGenre.getGenre());

            logger.info("No problem with path");
            return (long) contentGenres.size();
        } catch (IOException e) {
            logger.error("There was an error with the awards csv creation");
        }
        return 0L;
    }*/

    @Override
    public List<Film> exportFilms() {
        return null;
    }

    @Override
    public List<ContentIndividual> exportContentIndividuals() {
        return null;
    }

    @Override
    public List<Content> exportContent() {
        return null;
    }

    @Override
    public List<Individual> exportIndividuals() {
        return null;
    }

    @Override
    public List<IndividualRoleProjection> exportIndividualRole() {
        return null;
    }
}
