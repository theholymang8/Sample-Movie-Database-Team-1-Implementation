package com.pfseven.smdb.smdb.controllers;

import com.pfseven.smdb.smdb.controllers.transfer.ApiResponse;
import com.pfseven.smdb.smdb.domain.Film;
import com.pfseven.smdb.smdb.domain.FilmUniverse;
import com.pfseven.smdb.smdb.domain.Genre;
import com.pfseven.smdb.smdb.projections.ContentPerGenreReport;
import com.pfseven.smdb.smdb.services.BaseService;
import com.pfseven.smdb.smdb.services.FilmService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RequiredArgsConstructor
@RestController
@RequestMapping("/film")
public class FilmController extends AbstractController<Film>{

    private final FilmService filmService;

    @Override
    protected BaseService<Film, Long> getBaseService() {
        return filmService;
    }

    @GetMapping(path = "find", headers = "action=findByTitle", params = {"title"})
    public ResponseEntity<ApiResponse<Film>> find(@RequestParam("title") String title){
        return ResponseEntity.ok(ApiResponse.<Film>builder()
                .data(filmService.findByTitle(title))
                .build());
    }


    @GetMapping(path = "find", headers = "action=findByGenres")
    public ResponseEntity<ApiResponse<List<Film>>> findByGenres(@RequestParam List<Genre> genres){
        return ResponseEntity.ok(ApiResponse.<List<Film>>builder()
                .data(filmService.findByGenres(genres))
                .build());
    }

    @GetMapping(path = "find", headers = "action=findTopFilms", params = "limit")
    public ResponseEntity<ApiResponse<List<Film>>> findTopFilms(@RequestParam(value = "limit") Integer limit){
        return ResponseEntity.ok(ApiResponse.<List<Film>>builder()
                .data(filmService.findTopContent(limit))
                .build());
    }

    @GetMapping(path = "find", headers = "action=findByUniverse", params = {"universe"})
    public ResponseEntity<ApiResponse<List<Film>>> findByUniverse(@RequestParam("universe")FilmUniverse filmUniverse){
        return ResponseEntity.ok(ApiResponse.<List<Film>>builder()
                .data(filmService.findByUniverse(filmUniverse))
                .build());
    }

    @GetMapping(path="find",
            headers = "action=filmsPerGenreForGivenIndividual",
            params = {"firstName", "lastName"})
    public ResponseEntity<ApiResponse<Map<Genre, List<ContentPerGenreReport>>>> contentPerGenreForGivenIndividual(
            @RequestParam("firstName") String firstName,
            @RequestParam("lastName") String lastName){
        return ResponseEntity.ok(ApiResponse.<Map<Genre, List<ContentPerGenreReport>>>builder()
                .data(filmService.contentPerGenreForGivenIndividual(firstName, lastName))
                .build());
    }

}
