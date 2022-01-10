package com.pfseven.smdb.smdb.controllers;

import com.pfseven.smdb.smdb.controllers.transfer.ApiResponse;
import com.pfseven.smdb.smdb.domain.Film;
import com.pfseven.smdb.smdb.domain.TvShow;
import com.pfseven.smdb.smdb.services.BaseService;
import com.pfseven.smdb.smdb.services.FilmService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/film")
public class FilmController extends AbstractController<Film>{

    private final FilmService filmService;

    @Override
    protected BaseService<Film, Long> getBaseService() {
        return filmService;
    }

    @GetMapping(value = "find", params = {"title"})
    public ResponseEntity<ApiResponse<Film>> find(@RequestParam("title") String title){
        return ResponseEntity.ok(ApiResponse.<Film>builder()
                .data(filmService.findByTitle(title))
                .build());
    }

}
