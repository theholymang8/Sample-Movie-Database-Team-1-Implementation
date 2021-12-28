package com.pfseven.smdb.smdb.bootstrap;

import com.pfseven.smdb.smdb.base.AbstractLogComponent;
import com.pfseven.smdb.smdb.domain.Individual;
import com.pfseven.smdb.smdb.services.IndividualService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
@Profile("content-generator")
public class IndividualsFactory extends AbstractLogComponent implements CommandLineRunner {

    private final IndividualService individualService;

    @Override
    public void run(String... args)  {

        List<Individual> individual = individualService.createAll(
                Individual.builder()
                        .email("liamneeson@outlook.com")
                        .age(69)
                        .firstName("Liam")
                        .lastName("Neeson")
                        .nationality("British")
                        .build(),
                Individual.builder()
                        .email("drewbarrymore@outlook.com")
                        .age(46)
                        .firstName("Drew")
                        .lastName("Barrymore")
                        .nationality("American")
                        .build(),
                Individual.builder()
                        .email("timallen@gmail.com")
                        .age(68)
                        .firstName("Tim")
                        .lastName("Allen")
                        .nationality("American")
                        .build(),
                Individual.builder()
                        .email("jonburton@gmail.com")
                        .age(52)
                        .firstName("Jon")
                        .lastName("Burton")
                        .nationality("British")
                        .build(),
                Individual.builder()
                        .email("ronweasley@gmail.com")
                        .age(60)
                        .firstName("Wesley")
                        .lastName("Archer")
                        .nationality("American")
                        .build(),
                Individual.builder()
                        .email("stevenspielrock@gmail.com")
                        .age(77)
                        .firstName("Steven")
                        .lastName("Spielberg")
                        .nationality("American")
                        .build(),
                Individual.builder()
                        .email("melissamathison@gmail.com")
                        .age(65)
                        .firstName("Melissa")
                        .lastName("Mathison")
                        .nationality("American")
                        .build(),
                Individual.builder()
                        .email("anndruchii@gmail.com")
                        .age(73)
                        .firstName("Ann")
                        .lastName("Druyan")
                        .nationality("American")
                        .build(),
                Individual.builder()
                        .email("robertlevine@gmail.com")
                        .age(45)
                        .firstName("Robert")
                        .lastName("Levine")
                        .nationality("American")
                        .build(),
                Individual.builder()
                        .email("nothisispatrick@gmail.com")
                        .age(59)
                        .firstName("Patrick")
                        .lastName("Gilmore")
                        .nationality("American")
                        .build(),
                Individual.builder()
                        .email("stevenspielrock@gmail.com")
                        .age(77)
                        .firstName("Steven")
                        .lastName("Spielberg")
                        .nationality("American")
                        .build(),
                Individual.builder()
                        .email("kathleenkennedy@gmail.com")
                        .age(69)
                        .firstName("Kathleen")
                        .lastName("Kennedy")
                        .nationality("American")
                        .build()
/*
            //Form used for future inserts.
                Individual.builder()
                        .email("")
                        .age()
                        .firstName("")
                        .lastName("")
                        .nationality("")
                        .build(),
*/
        );
        //individualService.createAll(individuals);
        logger.info("Created 12 Individuals: {}", individuals);
    }
}