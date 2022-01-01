package com.pfseven.smdb.smdb.repositories;

import com.pfseven.smdb.smdb.domain.ContributingRole;
import com.pfseven.smdb.smdb.domain.Individual;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IndividualRepository extends JpaRepository<Individual, Long> {

    Individual findByFirstNameAndLastName(String firstName, String lastName);

    Individual findByEmail(String email);

    List<Individual> findAllByContributingRole(ContributingRole contributingRole);

    List<Individual> findAllByNationality(String nationality);

    List<Individual> findAllByFirstName(String firstname);


    //List<Individual> findByFirstNameIgnoreCaseContaining(String firstName);

    //Optional<Individual> findByFirstNameIgnoreCaseContainingAndLastNameIgnoreCaseContaining(String firstName, String lastName);

    //Long exportActors(Individual individual);
}
