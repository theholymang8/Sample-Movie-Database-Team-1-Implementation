package com.pfseven.smdb.smdb.bootstrap;

import com.pfseven.smdb.smdb.base.AbstractLogComponent;
import com.pfseven.smdb.smdb.domain.Actor;
import com.pfseven.smdb.smdb.services.ActorService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
@Profile("content-generator")
public class TvShowsFactory extends AbstractLogComponent implements CommandLineRunner {

    private final TvShowService tvshowService;

    @Override
    public void run(String... args)  {

        List<TvShow> tvshows = tvshowService.createAll(
                TvShow.builder()
                        .title("")
                        .description("")
                        .genre("")
                        .length()
                        .releasedate('')
                        .rating()
                        .countryoforigin("")
                        .language("")
                        .awards("")
                        .budget()
                        .revenue()
                        .seasons()
                        .episodes()
                        .build(),
                TvShow.builder()
                        .title("")
                        .description("")
                        .genre("")
                        .length()
                        .releasedate('')
                        .rating()
                        .countryoforigin("")
                        .language("")
                        .awards("")
                        .budget()
                        .revenue()
                        .seasons()
                        .episodes()
                        .build(),
                TvShow.builder()
                        .title("")
                        .description("")
                        .genre("")
                        .length()
                        .releasedate('')
                        .rating()
                        .countryoforigin("")
                        .language("")
                        .awards("")
                        .budget()
                        .revenue()
                        .seasons()
                        .episodes()
                        .build(),
/*
        //Form used for future inserts.
                TvShow.builder()
                        .title("")
                        .description("")
                        .genre("")
                        .length()
                        .releasedate('')
                        .rating()
                        .countryoforigin("")
                        .language("")
                        .awards("")
                        .budget()
                        .revenue()
                        .seasons()
                        .episodes()
                        .build(),
                        */
        );
        //tvshowService.createAll(tvshows);
        logger.info("Created 3 tvshows: {}", tvshows);
    }
}
