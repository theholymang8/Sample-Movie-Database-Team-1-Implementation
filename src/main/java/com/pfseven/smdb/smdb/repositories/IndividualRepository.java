package com.pfseven.smdb.smdb.repositories;

import com.pfseven.smdb.smdb.domain.Individual;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface IndividualRepository extends JpaRepository<Individual, Long> {

    List<Individual> findByFirstNameIgnoreCaseContaining(String firstName);

    Optional<Individual> findByFirstNameIgnoreCaseContainingAndLastNameIgnoreCaseContaining(String firstName, String lastName);

    Long exportActors(Individual individual);
}
