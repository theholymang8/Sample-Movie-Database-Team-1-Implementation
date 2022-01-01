package com.pfseven.smdb.smdb.services;

import com.pfseven.smdb.smdb.domain.ContributingRole;
import com.pfseven.smdb.smdb.domain.Individual;
import com.pfseven.smdb.smdb.repositories.IndividualRepository;
import lombok.RequiredArgsConstructor;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

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
    public List<Individual> findAllByContributingRole(ContributingRole contributingRole) {
        return individualRepository.findAllByContributingRole(contributingRole);
    }

    @Override
    public List<Individual> findAllByNationality(String nationality) {
        return individualRepository.findAllByNationality(nationality);
    }

    @Override
    public List<Individual> findAllByFirstName(String firstname) {
        return individualRepository.findAllByFirstName(firstname);
    }
}
