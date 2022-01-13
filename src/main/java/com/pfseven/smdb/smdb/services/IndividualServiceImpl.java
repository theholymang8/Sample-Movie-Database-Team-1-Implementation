package com.pfseven.smdb.smdb.services;

import com.pfseven.smdb.smdb.domain.ContentIndividual;
import com.pfseven.smdb.smdb.domain.IndividualRole;
import com.pfseven.smdb.smdb.domain.Individual;
import com.pfseven.smdb.smdb.dto.IndividualAndContentPerContribution;
import com.pfseven.smdb.smdb.repositories.IndividualRepository;
import lombok.RequiredArgsConstructor;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

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
        logger.info("found Individual by first and last name {} {}", firstName, lastName);
        return individualRepository.findByFirstNameAndLastName(firstName, lastName);
    }

    @Override
    public Individual findByEmail(String email) {
        logger.info("find Individual by email {}", email);
        return individualRepository.findByEmail(email);
    }

    @Override
    public List<Individual> findAllByIndividualRole(IndividualRole individualRole) {
        logger.info("found all by individual role {}", individualRole);
        return individualRepository.findAllByIndividualRole(individualRole);
    }

    @Override
    public List<Individual> findAllByNationality(String nationality) {
        logger.info("found all by nationality {}", nationality);
        return individualRepository.findAllByNationality(nationality);
    }

    @Override
    public List<Individual> findIndividualByContributingRole(String firstName, String lastName, IndividualRole individualRole) {
        logger.info("found individual by contributing role {}", individualRole);
        return individualRepository.findIndividualByContributingRole(firstName,lastName, individualRole);
    }

    @Override
    public List<Individual> findAllByFirstName(String firstname) {
        logger.info("found all by first name {}", firstname);
        return individualRepository.findAllByFirstName(firstname);
    }

}
