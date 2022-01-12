package com.pfseven.smdb.smdb.controllers;

import com.pfseven.smdb.smdb.controllers.transfer.ApiResponse;
import com.pfseven.smdb.smdb.domain.ContentIndividual;
import com.pfseven.smdb.smdb.domain.Individual;
import com.pfseven.smdb.smdb.domain.IndividualRole;
import com.pfseven.smdb.smdb.dto.IndividualAndContentPerContribution;
import com.pfseven.smdb.smdb.services.BaseService;
import com.pfseven.smdb.smdb.services.IndividualService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequiredArgsConstructor
@RequestMapping("/individuals")
public class IndividualController extends AbstractController<Individual>{

    private final IndividualService individualService;

    @Override
    protected BaseService<Individual, Long> getBaseService() {
        return individualService;
    }

    @GetMapping(path = "find", headers = "action=findByFirstNameAndLastName", params = {"name", "surname"})
    public ResponseEntity<ApiResponse<Individual>> find(@RequestParam(value = "name") String firstName, @RequestParam(value = "surname") String lastName){
        return ResponseEntity.ok(ApiResponse.<Individual>builder()
                                            .data(individualService.findByFirstNameAndLastName(firstName, lastName))
                                            .build());
    }

    @GetMapping(path = "find", headers = "action=findByEmail", params = {"email"})
    public ResponseEntity<ApiResponse<Individual>> findByEmail(@RequestParam(value = "email") String email){
        return ResponseEntity.ok(ApiResponse.<Individual>builder()
                .data(individualService.findByEmail(email))
                .build());
    }

    @GetMapping(path = "find",
                headers = "action=findByContributingRole",
                params = {"firstName", "lastName", "contributingRole"})
    public ResponseEntity<ApiResponse<List<Individual>>> findByContributingRole(
            @RequestParam(value ="firstName") String firstName,
            @RequestParam(value = "lastName") String lastName,
            @RequestParam(value = "contributingRole")IndividualRole contributingRole){
        return ResponseEntity.ok(ApiResponse.<List<Individual>>builder()
                .data(individualService.findIndividualByContributingRole(firstName, lastName, contributingRole))
                .build());
    }

}
