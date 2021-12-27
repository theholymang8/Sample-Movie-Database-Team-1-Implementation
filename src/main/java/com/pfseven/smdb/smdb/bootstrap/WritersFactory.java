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
                        .email("melissamathison@gmail.com")
                        .age(65)
                        .firstName("Melissa")
                        .lastName("Mathison")
                        .nationality("American")
                        .awards("")
                        .screenplays("2016 The BFG, 1997 Kundun, 1995 The Indian in the Cupboard, 1991 Son of the Morning Star, 1983 Twilight Zone: The Movie, 1982 E.T. the Extra-Terrestrial, 1982 The Escape Artist, 1979 The Black Stallion")
                        .build(),
                Writer.builder()
                        .email("anndruchii@gmail.com")
                        .age(73)
                        .firstName("Ann")
                        .lastName("Druyan")
                        .nationality("American")
                        .awards("Outstanding Writing for Nonfiction Programming Cosmos: A Spacetime Odyssey (2014)")
                        .screenplays("Cosmos 1980, The Earth Day Special 1990, Contact 1997, The Search for Life 2002, Cosmos: A Spacetime Odyssey 2014, Cosmos: Possible Worlds 2020.")
                        .build(),
                Writer.builder()
                        .email("robertlevine@gmail.com")
                        .age(45)
                        .firstName("Robert")
                        .lastName("Levine")
                        .nationality("American")
                        .awards("")
                        .screenplays("Jericho 2006, Risk: Factions 2010, Human Target 2010, Black Sails 2014, Gone Baby Gone 2018.")
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