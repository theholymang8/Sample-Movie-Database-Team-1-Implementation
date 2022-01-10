package com.pfseven.smdb.smdb.controllers;

import com.pfseven.smdb.smdb.controllers.transfer.ApiResponse;
import com.pfseven.smdb.smdb.domain.Individual;
import com.pfseven.smdb.smdb.domain.TvShow;
import com.pfseven.smdb.smdb.services.BaseService;
import com.pfseven.smdb.smdb.services.TvShowService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/tvshows")
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

}
