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
public class DirectorsFactory extends AbstractLogComponent implements CommandLineRunner {

    private final DirectorService directorService;

    @Override
    public void run(String... args)  {

        List<Director> directors = directorService.createAll(
                Director.builder()
                        .email("")
                        .age()
                        .firstName("")
                        .lastName("")
                        .nationality("")
                        .awards("")
                        .publicitylistings("")
                        .build(),
                Director.builder()
                        .email("")
                        .age()
                        .firstName("")
                        .lastName("")
                        .nationality("")
                        .awards("")
                        .publicitylistings("")
                        .build(),
                Director.builder()
                        .email("")
                        .age()
                        .firstName("")
                        .lastName("")
                        .nationality("")
                        .awards("")
                        .publicitylistings("")
                        .build()
/*
            //Form used for future inserts.
                Director.builder()
                        .email("")
                        .age()
                        .firstName("")
                        .lastName("")
                        .nationality("")
                        .awards("")
                        .publicitylistings("")
                        .build(),
*/
        );
        //directorService.createAll(director);
        logger.info("Created 3 directors: {}", directors);
    }
}
