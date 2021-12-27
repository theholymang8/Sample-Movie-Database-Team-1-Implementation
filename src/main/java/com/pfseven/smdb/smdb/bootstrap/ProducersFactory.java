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
                        .email("nothisispatrick@gmail.com")
                        .age(59)
                        .firstName("Patrick")
                        .lastName("Gilmore")
                        .nationality("American")
                        .awards("")
                        .contributions(250000000)
                        .productioncompany("Pixar Animation Studios")
                        .build(),
                Producer.builder()
                        .email("stevenspielrock@gmail.com")
                        .age(77)
                        .firstName("Steven")
                        .lastName("Spielberg")
                        .nationality("American")
                        .awards("Best Director Saving Private Ryan (1998), Best Picture Schindler's List (1993), Outstanding Miniseries The Pacific (2010), Outstanding Miniseries Taken (2002), Outstanding Miniseries Band of Brothers (2001)")
                        .contributions(543000000)
                        .productioncompany("")
                        .build(),
                Producer.builder()
                        .email("kathleenkennedy@gmail.com")
                        .age(69)
                        .firstName("Kathleen")
                        .lastName("Kennedy")
                        .nationality("American")
                        .awards("")
                        .contributions(7500000)
                        .productioncompany("Universal Pictures")
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
                        .productioncompany("")
                        .build(),
*/
        );
        //producerService.createAll(producers);
        logger.info("Created 3 producers: {}", producers);
    }
}