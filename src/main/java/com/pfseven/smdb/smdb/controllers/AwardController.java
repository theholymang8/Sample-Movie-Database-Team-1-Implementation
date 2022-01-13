package com.pfseven.smdb.smdb.controllers;

import com.pfseven.smdb.smdb.controllers.transfer.ApiResponse;
import com.pfseven.smdb.smdb.domain.Award;
import com.pfseven.smdb.smdb.services.AwardService;
import com.pfseven.smdb.smdb.services.BaseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("awards")
public class AwardController extends AbstractController<Award> {

    private final AwardService awardService;

    @Override
    protected BaseService<Award, Long> getBaseService() {
        return awardService;
    }

    @GetMapping(path = "find", headers = "action=findByTitle", params = {"title"})
    public ResponseEntity<ApiResponse<Award>> find(@RequestParam("title") String title){
        return ResponseEntity.ok(ApiResponse.<Award>builder()
                .data(awardService.findByTitle(title))
                .build());
    }

    @GetMapping(path = "find", headers = "action=findByCategory", params = {"category"})
    public ResponseEntity<ApiResponse<List<Award>>> findByCategory(@RequestParam("category") String category){
        return ResponseEntity.ok(ApiResponse.<List<Award>>builder()
                .data(awardService.findByCategory(category))
                .build());
    }

    @GetMapping(path = "find", headers = "action=findByYear", params = {"year"})
    public ResponseEntity<ApiResponse<List<Award>>> findByYear(@RequestParam("year") String year){
        return ResponseEntity.ok(ApiResponse.<List<Award>>builder()
                .data(awardService.findByYear(year))
                .build());
    }
}
