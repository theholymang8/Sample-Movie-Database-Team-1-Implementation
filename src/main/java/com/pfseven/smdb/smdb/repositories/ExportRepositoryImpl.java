package com.pfseven.smdb.smdb.repositories;

import com.pfseven.smdb.smdb.base.AbstractLogComponent;
import com.pfseven.smdb.smdb.domain.*;
import com.pfseven.smdb.smdb.projections.ContentGenre;
import com.pfseven.smdb.smdb.projections.ContentIndividual;
import com.pfseven.smdb.smdb.projections.IndividualRoleProjection;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@NoArgsConstructor
@Repository
public class ExportRepositoryImpl extends AbstractLogComponent implements ExportRepository{

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Award> exportAwards() {
        //entityManager.getTransaction().begin();

        List<Award> awards = entityManager.createNativeQuery("SELECT ID, CATEGORY, TITLE, YEAROFAWARD, CONTENT_ID, INDIVIDUAL_ID FROM AWARDS").getResultList();
        logger.info("{}", awards);
        return awards;

        //return entityManager.createNativeQuery("SELECT * FROM AWARDS").getResultList();
    }

    @Override
    public List<ContentGenre> exportContentGenre() {
        return entityManager.createNativeQuery("SELECT CONTENT_ID, GENRE FROM CONTENT_GENRE").getResultList();
    }

    @Override
    public List<Film> exportFilms() {
        return entityManager.createNativeQuery("SELECT * FROM FILMS").getResultList();
    }

    @Override
    public List<ContentIndividual> exportContentIndividuals() {
        return entityManager.createNativeQuery("SELECT * FROM CONTENT_INDIVIDUALS").getResultList();
    }

    @Override
    public List<Content> exportContent() {
        return entityManager.createNativeQuery("SELECT * FROM CONTENT").getResultList();
    }

    @Override
    public List<Individual> exportIndividuals() {
        return entityManager.createNativeQuery("SELECT * FROM INDIVIDUALS").getResultList();
    }

    @Override
    public List<IndividualRoleProjection> exportIndividualRole() {
        return entityManager.createNativeQuery("SELECT * FROM INDIVIDUAL_ROLE").getResultList();
    }

    @Override
    public List<TvShow> exportTvShows() {
        return entityManager.createNativeQuery("SELECT * FROM TV_SHOWS").getResultList();
    }
}
