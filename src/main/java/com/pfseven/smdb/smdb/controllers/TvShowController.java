package com.pfseven.smdb.smdb.controllers;

import com.pfseven.smdb.smdb.controllers.transfer.ApiResponse;
import com.pfseven.smdb.smdb.domain.Genre;
import com.pfseven.smdb.smdb.domain.TvShow;
import com.pfseven.smdb.smdb.dto.CountPerYearReport;
import com.pfseven.smdb.smdb.services.BaseService;
import com.pfseven.smdb.smdb.services.TvShowService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
import java.util.Set;

@RestController
@RequiredArgsConstructor
@RequestMapping("/tvShows")
public class TvShowController extends AbstractController<TvShow>{

    private final TvShowService tvShowService;

    @Override
    protected BaseService<TvShow, Long> getBaseService() {
        return tvShowService;
    }

    @GetMapping(value = "find", params = {"title"})
    public ResponseEntity<ApiResponse<TvShow>> find(@RequestParam("title") String title){
        return ResponseEntity.ok(ApiResponse.<TvShow>builder()
                .data(tvShowService.findByTitle(title))
                .build());
    }

    @GetMapping(path = "find", headers = "action=findByGenres")
    public ResponseEntity<ApiResponse<List<TvShow>>> findByGenres(@RequestParam List<Genre> genres){
        return ResponseEntity.ok(ApiResponse.<List<TvShow>>builder()
                .data(tvShowService.findByGenres(genres))
                .build());
    }

    @GetMapping(path = "find", headers = "action=findTopTvShows", params = "limit")
    public ResponseEntity<ApiResponse<List<TvShow>>> findTopTvShows(@RequestParam(value = "limit") Integer limit) {
        return ResponseEntity.ok(ApiResponse.<List<TvShow>>builder()
                .data(tvShowService.findTopContent(limit))
                .build());
    }

    @GetMapping(path = "count", headers = "action=countByGenres")
    public ResponseEntity<ApiResponse<Map<Genre, Integer>>> countByGenres(@RequestParam  Set<Genre> genres) {
        return ResponseEntity.ok(ApiResponse.<Map<Genre, Integer>>builder()
                .data(tvShowService.countByGenres(genres))
                .build());
    };

    @GetMapping(path = "count", headers = "action=countByGenresPerYear")
    public ResponseEntity<ApiResponse<Map<Genre, List<CountPerYearReport>>>> countByGenresPerYear(@RequestParam  Set<Genre> genres) {
        return ResponseEntity.ok(ApiResponse.<Map<Genre, List<CountPerYearReport>>>builder()
                .data(tvShowService.countByYearAndGenres(genres))
                .build());
    };

}
