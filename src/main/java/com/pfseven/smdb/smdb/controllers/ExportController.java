package com.pfseven.smdb.smdb.controllers;

import com.pfseven.smdb.smdb.controllers.transfer.ApiResponse;
import com.pfseven.smdb.smdb.services.*;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("export")
public class ExportController {

    private final ExportService exportService;

    @GetMapping(headers = "action=awards")
    public ResponseEntity<ApiResponse<Long>> exportAwards(){
        return ResponseEntity.ok(ApiResponse.<Long>builder()
                .data(exportService.exportAwards())
                .build());
    }

    @GetMapping(headers = "action=contentGenre")
    public ResponseEntity<ApiResponse<Long>> exportContentGenre(){
        return ResponseEntity.ok(ApiResponse.<Long>builder()
                .data(exportService.exportContentGenre())
                .build());
    }

    @GetMapping(headers = "action=contentIndividuals")
    public ResponseEntity<ApiResponse<Long>> exportContentIndividuals(){
        return ResponseEntity.ok(ApiResponse.<Long>builder()
                .data(exportService.exportContentIndividuals())
                .build());
    }

    @GetMapping(headers = "action=individualRoles")
    public ResponseEntity<ApiResponse<Long>> exportIndividualRoles(){
        return ResponseEntity.ok(ApiResponse.<Long>builder()
                .data(exportService.exportIndividualRole())
                .build());
    }

    @GetMapping(headers = "action=individuals")
    public ResponseEntity<ApiResponse<Long>> exportIndividuals(){
        return ResponseEntity.ok(ApiResponse.<Long>builder()
                .data(exportService.exportIndividuals())
                .build());
    }

    @GetMapping(headers = "action=films")
    public ResponseEntity<ApiResponse<Long>> exportFilms(){
        return ResponseEntity.ok(ApiResponse.<Long>builder()
                .data(exportService.exportFilms())
                .build());
    }

    @GetMapping(headers = "action=tvShows")
    public ResponseEntity<ApiResponse<Long>> exportTvShows(){
        return ResponseEntity.ok(ApiResponse.<Long>builder()
                .data(exportService.exportTvShows())
                .build());
    }

    @GetMapping(headers = "action=content")
    public ResponseEntity<ApiResponse<Long>> exportContent(){
        return ResponseEntity.ok(ApiResponse.<Long>builder()
                .data(exportService.exportContent())
                .build());
    }

}
