package com.pfseven.smdb.smdb.controllers;

import com.pfseven.smdb.smdb.controllers.transfer.ApiResponse;
import com.pfseven.smdb.smdb.domain.Award;
import com.pfseven.smdb.smdb.services.ContentService;
import com.pfseven.smdb.smdb.services.ExportService;
import com.pfseven.smdb.smdb.services.FilmService;
import com.pfseven.smdb.smdb.services.FilmServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("export")
public class ExportController {

    private final ExportService exportService;
    //private final ContentService contentService;
    private final FilmService filmService;

    @GetMapping(headers = "action=awards")
    public ResponseEntity<ApiResponse<Long>> exportAwards(){
        return ResponseEntity.ok(ApiResponse.<Long>builder()
                .data(exportService.exportAwards())
                .build());
    }

    /*@GetMapping(headers = "action=contentGenre")
    public ResponseEntity<ApiResponse<Long>> exportContentGenre(){
        return ResponseEntity.ok(ApiResponse.<Long>builder()
                .data(contentService.exportContentGenre())
                .build());
    }*/

    @GetMapping(headers = "action=films")
    public ResponseEntity<ApiResponse<Long>> exportFilms(){
        return ResponseEntity.ok(ApiResponse.<Long>builder()
                .data(filmService.exportFilms())
                .build());
    }

}
