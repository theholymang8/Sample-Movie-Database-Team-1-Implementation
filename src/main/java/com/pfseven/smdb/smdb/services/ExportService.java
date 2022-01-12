package com.pfseven.smdb.smdb.services;

import com.pfseven.smdb.smdb.domain.Award;
import com.pfseven.smdb.smdb.domain.Content;
import com.pfseven.smdb.smdb.domain.Film;
import com.pfseven.smdb.smdb.domain.Individual;
import com.pfseven.smdb.smdb.projections.ContentGenre;
import com.pfseven.smdb.smdb.projections.ContentIndividual;
import com.pfseven.smdb.smdb.projections.IndividualRoleProjection;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ExportService {

    Long exportAwards();

    Long exportContentGenre();

    List<Film> exportFilms();

    List<ContentIndividual> exportContentIndividuals();

    List<Content> exportContent();

    List<Individual> exportIndividuals();

    List<IndividualRoleProjection> exportIndividualRole();

}
