package com.pfseven.smdb.smdb.services;

import com.pfseven.smdb.smdb.domain.*;
import com.pfseven.smdb.smdb.pojo.IndivContentPerGenreReport;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface IndividualService extends BaseService<Individual, Long>{

    Individual findByFirstNameAndLastName(String firstName, String lastName);

    Individual findByEmail(String email);

    List<Individual> findAllByFirstName(String firstname);

    List<Individual> findAllByIndividualRole(IndividualRole individualRole);

    List<Individual> findAllByNationality(String nationality);

    List<Individual> findByFirstNameAndIndividualRole(String firstName, IndividualRole individualRole);

    List<Individual>  findByFirstNameAndLastNameAndGenre(String firstName, String lastName, final Set<Genre> genres);

}
