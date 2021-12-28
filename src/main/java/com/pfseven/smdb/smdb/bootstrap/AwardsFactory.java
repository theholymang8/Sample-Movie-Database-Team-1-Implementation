package com.pfseven.smdb.smdb.bootstrap;

import com.pfseven.smdb.smdb.base.AbstractLogComponent;
import com.pfseven.smdb.smdb.domain.Award;
import com.pfseven.smdb.smdb.services.AwardService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
@Profile("content-generator")
public class AwardsFactory extends AbstractLogComponent implements CommandLineRunner {

    private final AwardService awardService;

    @Override
    public void run(String... args)  {

        List<Award> awards = awardService.createAll(
                Award.builder()
                        .title("Best Picture")
                        .yearOfAward("1994")
                        .category("Oscar")
                        .build(),
                Award.builder()
                        .title("Special Achievement Award")
                        .yearOfAward("1996")
                        .category("Oscar")
                        .build(),
                Award.builder()
                        .title("Outstanding Animated Program")
                        .yearOfAward("2014")
                        .category("Emmy")
                        .build());
/*
            //Form used for future inserts.
                Award.builder()
                        .title("")
                        .dateOfAward('')
                        .category("")
                        .build(),

*/
        //awardService.createAll(awards);
        logger.info("Created 3 awards: {}", awards);
    }
}
