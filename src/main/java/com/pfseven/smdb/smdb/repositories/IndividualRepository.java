package com.pfseven.smdb.smdb.repositories;

import com.pfseven.smdb.smdb.domain.ContentIndividual;
import com.pfseven.smdb.smdb.domain.IndividualRole;
import com.pfseven.smdb.smdb.domain.Individual;
import com.pfseven.smdb.smdb.dto.IndivPerRoleReport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IndividualRepository extends JpaRepository<Individual, Long> {

    Individual findByFirstNameAndLastName(String firstName, String lastName);

    Individual findByEmail(String email);

    List<Individual> findAllByIndividualRole(IndividualRole individualRole);

    List<Individual> findAllByNationality(String nationality);

    List<Individual> findAllByFirstName(String firstname);

    @Query
    List<ContentIndividual> findIndividualByContributingRole(String firstName, String lastName, IndividualRole individualRole);

}
