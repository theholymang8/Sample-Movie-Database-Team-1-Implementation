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
                        .title("Cosmos: A Spacetime Odyssey")
                        .description("An exploration of our discovery of the laws of nature and coordinates in space and time.")
                        .genre("Documentary")
                        .length(44)
                        .releasedate('2014-03-09')
                        .rating(9.3)
                        .countryoforigin("USA")
                        .language("English")
                        .awards("Outstanding Original Main Title Theme Music, Outstanding Writing for Nonfiction Programming, Outstanding Sound Editing for Nonfiction Programming, Outstanding Music Composition for a Series.")
                        .budget(6000000)
                        .revenue(135429666)
                        .seasons(1)
                        .episodes(13)
                        .build(),
                TvShow.builder()
                        .title("Black Sails")
                        .description("Follows Captain Flint and his pirates twenty years prior to Robert Louis Stevenson's classic novel \"Treasure Island.\"")
                        .genre("Adventure, Drama")
                        .length(56)
                        .releasedate('2014-01-25')
                        .rating(8.2)
                        .countryoforigin("USA, South Africa")
                        .language("English")
                        .awards("Outstanding Sound Editing for a Series, Outstanding Special and Visual Effects in a Supporting Role")
                        .budget(15460000)
                        .revenue(249752131)
                        .seasons(4)
                        .episodes(38)
                        .build(),
                TvShow.builder()
                        .title("Rick and Morty")
                        .description("An animated series that follows the exploits of a super scientist and his not-so-bright grandson.")
                        .genre("Animation, Adventure, Comedy")
                        .length(23)
                        .releasedate('2013-12-02')
                        .rating(9.2)
                        .countryoforigin("USA")
                        .language("English")
                        .awards("Outstanding Animated Program.")
                        .budget(24000000)
                        .revenue(666732999)
                        .seasons(5)
                        .episodes(52)
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
