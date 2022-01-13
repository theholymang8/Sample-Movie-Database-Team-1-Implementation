package com.pfseven.smdb.smdb.services;

import com.pfseven.smdb.smdb.domain.*;
import com.pfseven.smdb.smdb.projections.ContentGenreProjection;
import com.pfseven.smdb.smdb.projections.ContentIndividualProjection;
import com.pfseven.smdb.smdb.projections.IndividualProjection;
import com.pfseven.smdb.smdb.projections.IndividualRoleProjection;

import java.util.List;

public interface IndividualService extends BaseService<Individual, Long>{

    Individual findByFirstNameAndLastName(String firstName, String lastName);

    Individual findByEmail(String email);

    List<Individual> findAllByFirstName(String firstname);

    List<Individual> findAllByIndividualRole(IndividualRole individualRole);

    List<Individual> findAllByNationality(String nationality);

    List<Individual> findIndividualByContributingRole(String firstName, String lastName, IndividualRole individualRole);

    List<ContentGenreProjection> getContentGenre();

    List<ContentIndividualProjection> getContentIndividuals();

    List<IndividualRoleProjection> getIndividualRole();

    List<IndividualProjection> getIndividuals();
}
