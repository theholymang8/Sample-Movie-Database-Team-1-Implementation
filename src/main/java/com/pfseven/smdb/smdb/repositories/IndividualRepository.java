package com.pfseven.smdb.smdb.repositories;

import com.pfseven.smdb.smdb.domain.IndividualRole;
import com.pfseven.smdb.smdb.domain.Individual;
import com.pfseven.smdb.smdb.projections.ContentGenreProjection;
import com.pfseven.smdb.smdb.projections.ContentIndividualProjection;
import com.pfseven.smdb.smdb.projections.IndividualProjection;
import com.pfseven.smdb.smdb.projections.IndividualRoleProjection;
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
    List<Individual> findIndividualByContributingRole(String firstName, String lastName, IndividualRole individualRole);

    @Query(value = "SELECT CONTENT_ID, GENRE FROM CONTENT_GENRE", nativeQuery = true)
    List<ContentGenreProjection> getContentGenre();

    @Query(value = "SELECT * FROM CONTENT_INDIVIDUALS", nativeQuery = true)
    List<ContentIndividualProjection> getContentIndividuals();

    @Query(value = "SELECT * FROM INDIVIDUAL_ROLE", nativeQuery = true)
    List<IndividualRoleProjection> getIndividualRole();

    @Query(value = "SELECT * FROM INDIVIDUALS", nativeQuery = true)
    List<IndividualProjection> getIndividuals();

}
