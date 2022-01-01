package com.pfseven.smdb.smdb.services;

import com.pfseven.smdb.smdb.domain.ContributingRole;
import com.pfseven.smdb.smdb.domain.Individual;

import java.util.List;

public interface IndividualService extends BaseService<Individual, Long>{

    Individual findByFirstNameAndLastName(String firstName, String lastName);

    Individual findByEmail(String email);

    List<Individual> findAllByContributingRole(ContributingRole contributingRole);

    List<Individual> findAllByNationality(String nationality);

    List<Individual> findAllByFirstName(String firstname);

    //List<Individual> findIndividualByFirstName(String firstName);

    //Individual findIndividualByFullName(String firstName, String lastName);

    //Long exportIndividuals(Individual individual);
}
