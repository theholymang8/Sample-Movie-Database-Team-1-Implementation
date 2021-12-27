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
public class WritersFactory extends AbstractLogComponent implements CommandLineRunner {

    private final WriterService writerService;

    @Override
    public void run(String... args)  {

        List<Writer> writers = writerService.createAll(
                Writer.builder()
                        .email("")
                        .age()
                        .firstName("")
                        .lastName("")
                        .nationality("")
                        .awards("")
                        .screenplays()
                        .build(),
                Writer.builder()
                        .email("")
                        .age()
                        .firstName("")
                        .lastName("")
                        .nationality("")
                        .awards("")
                        .screenplays()
                        .build(),
                Writer.builder()
                        .email("")
                        .age()
                        .firstName("")
                        .lastName("")
                        .nationality("")
                        .awards("")
                        .screenplays()
                        .build()
/*
            //Form used for future inserts.
                Writer.builder()
                        .email("")
                        .age()
                        .firstName("")
                        .lastName("")
                        .nationality("")
                        .awards("")
                        .screenplays()
                        .build(),
*/
        );
        //writerService.createAll(Producer);
        logger.info("Created 3 writers: {}", writers);
    }
}