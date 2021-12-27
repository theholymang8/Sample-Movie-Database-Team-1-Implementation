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
                        .email("jonburton@gmail.com")
                        .age(52)
                        .firstName("Jon")
                        .lastName("Burton")
                        .nationality("British")
                        .awards("Best Family Game - Lego Batman 2: DC Super Heroes")
                        .publicitylistings("He is known for his work on Lego Batman 2: DC Super Heroes (2012), Lego Dimensions (2015) and Lego: The Movie (2014).")
                        .build(),
                Director.builder()
                        .email("ronweasley@gmail.com")
                        .age(60)
                        .firstName("Wesley")
                        .lastName("Archer")
                        .nationality("American")
                        .awards("Outstanding Animated Program Rick and Morty (2013), Outstanding Animated Program King of the Hill (1997)")
                        .publicitylistings("")
                        .build(),
                Director.builder()
                        .email("stevenspielrock@gmail.com")
                        .age(77)
                        .firstName("Steven")
                        .lastName("Spielberg")
                        .nationality("American")
                        .awards("Best Director Saving Private Ryan (1998), Best Picture Schindler's List (1993), Outstanding Miniseries The Pacific (2010), Outstanding Miniseries Taken (2002), Outstanding Miniseries Band of Brothers (2001)")
                        .publicitylistings("One of the most influential personalities in the history of cinema, Steven Spielberg is Hollywood's best known director and one of the wealthiest filmmakers in the world.")
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
