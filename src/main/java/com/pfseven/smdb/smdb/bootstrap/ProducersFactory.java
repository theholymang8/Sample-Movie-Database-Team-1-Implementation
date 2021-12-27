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
public class ProducersFactory extends AbstractLogComponent implements CommandLineRunner {

    private final ProducerService directorService;

    @Override
    public void run(String... args)  {

        List<Producer> producers = producerService.createAll(
                Producer.builder()
                        .email("")
                        .age()
                        .firstName("")
                        .lastName("")
                        .nationality("")
                        .awards("")
                        .contributions()
                        .productioncompany()
                        .build(),
                Producer.builder()
                        .email("")
                        .age()
                        .firstName("")
                        .lastName("")
                        .nationality("")
                        .awards("")
                        .contributions()
                        .productioncompany()
                        .build(),
                Producer.builder()
                        .email("")
                        .age()
                        .firstName("")
                        .lastName("")
                        .nationality("")
                        .awards("")
                        .contributions()
                        .productioncompany()
                        .build()
/*
            //Form used for future inserts.
                Producer.builder()
                        .email("")
                        .age()
                        .firstName("")
                        .lastName("")
                        .nationality("")
                        .awards("")
                        .contributions()
                        .productioncompany()
                        .build(),
*/
        );
        //producerService.createAll(producers);
        logger.info("Created 3 producers: {}", producers);
    }
}