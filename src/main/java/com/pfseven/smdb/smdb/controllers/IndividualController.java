package com.pfseven.smdb.smdb.controllers;

import com.pfseven.smdb.smdb.controllers.transfer.ApiResponse;
import com.pfseven.smdb.smdb.domain.Individual;
import com.pfseven.smdb.smdb.dto.IndividualAndAssociations;
import com.pfseven.smdb.smdb.services.BaseService;
import com.pfseven.smdb.smdb.services.IndividualService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
@RequestMapping("/individuals")
public class IndividualController extends AbstractController<Individual>{

    private final IndividualService individualService;

    @Override
    protected BaseService<Individual, Long> getBaseService() {
        return individualService;
    }

    @GetMapping(value = "/find", params = {"name", "surname"})
    public ResponseEntity<ApiResponse<Individual>> find(@RequestParam("name") String firstName, @RequestParam("surname") String lastName){
        Individual individual = individualService.findByFirstNameAndLastName(firstName, lastName);
        return ResponseEntity.ok(ApiResponse.<Individual>builder()
                                            .data(individual)
                                            .build());
        //individualService.findByFirstNameAndLastName(firstName,lastName).getContentIndividuals().forEach(contentIndividual -> contentIndividual.getContent().getTitle());
    }

    //public ResponseEntity
}
