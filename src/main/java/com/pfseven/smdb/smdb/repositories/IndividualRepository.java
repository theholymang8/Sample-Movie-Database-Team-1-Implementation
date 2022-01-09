package com.pfseven.smdb.smdb.repositories;

import com.pfseven.smdb.smdb.domain.Genre;
import com.pfseven.smdb.smdb.domain.IndividualRole;
import com.pfseven.smdb.smdb.domain.Individual;
//import com.pfseven.smdb.smdb.pojo.IndivContentPerGenreReport;
//import com.pfseven.smdb.smdb.projections.IndividualInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Map;

public interface IndividualRepository extends JpaRepository<Individual, Long> {

    Individual findByFirstNameAndLastName(String firstName, String lastName);

    Individual findByEmail(String email);

    List<Individual> findAllByIndividualRole(IndividualRole individualRole);

    List<Individual> findAllByNationality(String nationality);

    List<Individual> findAllByFirstName(String firstname);

    List<Individual> findByIndividualRole(IndividualRole individualRole);

    @Query("select distinct IND from Individual IND join IND.contentIndividuals CI " +
            "where IND.firstName=?1 and IND.lastName=?2 and CI.contributingRole=?3 ")
    List<Individual> findIndividualByContributingRole(String firstName, String lastName, IndividualRole individualRole);

    @Query("select ind from Individual ind join ind.contentIndividuals conInd join conInd.content cont inner join cont.genres genre WHERE ind.firstName=?1 and ind.lastName=?2")
    List<Individual> findByFirstNameAndLastNameAndGenre(String firstName, String lastName, Genre genre);



    //List<Individual> findByFirstNameIgnoreCaseContaining(String firstName);

    //Optional<Individual> findByFirstNameIgnoreCaseContainingAndLastNameIgnoreCaseContaining(String firstName, String lastName);


}
