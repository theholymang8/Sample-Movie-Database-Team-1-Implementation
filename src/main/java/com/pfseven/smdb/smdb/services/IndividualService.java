package com.pfseven.smdb.smdb.services;

import com.pfseven.smdb.smdb.domain.*;

import java.util.List;

public interface IndividualService extends BaseService<Individual, Long>{

    Individual findByFirstNameAndLastName(String firstName, String lastName);

    Individual findByEmail(String email);

    List<Individual> findAllByFirstName(String firstname);

    List<Individual> findAllByIndividualRole(IndividualRole individualRole);

    List<Individual> findAllByNationality(String nationality);

    List<ContentIndividual> findIndividualByContributingRole(String firstName, String lastName, IndividualRole individualRole);

}
