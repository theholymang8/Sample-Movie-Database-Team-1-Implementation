package com.pfseven.smdb.smdb.services;

import com.pfseven.smdb.smdb.domain.ContentIndividual;
import com.pfseven.smdb.smdb.domain.Genre;
import com.pfseven.smdb.smdb.domain.IndividualRole;
import com.pfseven.smdb.smdb.domain.Individual;
import com.pfseven.smdb.smdb.pojo.CountPerYearReport;
//import com.pfseven.smdb.smdb.pojo.IndivContentPerGenreReport;
//import com.pfseven.smdb.smdb.projections.IndividualInfo;
import com.pfseven.smdb.smdb.repositories.IndividualRepository;
import lombok.RequiredArgsConstructor;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

@Service
@RequiredArgsConstructor
public class IndividualServiceImpl extends BaseServiceImpl<Individual> implements IndividualService {

    private final IndividualRepository individualRepository;

    @Override
    public JpaRepository<Individual, Long> getRepository() {
        return individualRepository;
    }

    @Override
    public Individual findByFirstNameAndLastName(String firstName, String lastName) {
        return individualRepository.findByFirstNameAndLastName(firstName, lastName);
    }

    @Override
    public Individual findByEmail(String email) {
        return individualRepository.findByEmail(email);
    }

    @Override
    public List<Individual> findAllByIndividualRole(IndividualRole individualRole) {
        return individualRepository.findAllByIndividualRole(individualRole);
    }

    @Override
    public List<Individual> findAllByNationality(String nationality) {
        return individualRepository.findAllByNationality(nationality);
    }

    @Override
    public List<Individual> findAllByFirstName(String firstname) {
        return individualRepository.findAllByFirstName(firstname);
    }

    @Override
    public List<Individual> findByFirstNameAndIndividualRole(String firstName, IndividualRole individualRole){
        return individualRepository.findByFirstNameAndIndividualRole(firstName, individualRole);
    }

    @Override
    public List<Individual> findByFirstNameAndLastNameAndGenre(String firstName, String lastName, final Set<Genre> genres){
        //List<IndivContentPerGenreReport> foundIndividual = new ArrayList<>();
        //for(Genre genre: genres){
             //foundIndividual.add(individualRepository.findByFirstNameAndLastNameAndGenre(firstName, lastName, genre));
        //}
        return individualRepository.findByFirstNameAndLastNameAndGenre(firstName, lastName, Genre.Drama);
    }


}
