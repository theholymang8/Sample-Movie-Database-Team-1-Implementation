package com.pfseven.smdb.smdb.repositories;

import com.pfseven.smdb.smdb.domain.*;
import com.pfseven.smdb.smdb.projections.ContentGenre;
import com.pfseven.smdb.smdb.projections.ContentIndividual;
import com.pfseven.smdb.smdb.projections.IndividualRoleProjection;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface ExportRepository  {

    List<Award> exportAwards();

    List<ContentGenre> exportContentGenre();

    List<Film> exportFilms();

    List<ContentIndividual> exportContentIndividuals();

    List<Content> exportContent();

    List<Individual> exportIndividuals();

    List<IndividualRoleProjection> exportIndividualRole();

    List<TvShow> exportTvShows();

}
