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
public class ActorsFactory extends AbstractLogComponent implements CommandLineRunner {

    private final ActorService actorService;

    @Override
    public void run(String... args)  {

        List<Actor> actors = actorService.createAll(
            Actor.builder()
                    .email("liamneelson@outlook.com")
                    .age(69)
                    .firstName("Liam")
                    .lastName("Neelson")
                    .nationality("British")
                    .awards("Best Actor - 1993 - Schindler's List, Best Actor - 1996 - Michael Collins, Best Actor - 2004 - Kinsey, ")
                    .role("Bryan Mills at Taken, Qui-Gon Jinn at Star Wars: Episode I - The Phantom Menace")
                    .build(),
            Actor.builder()
                    .email("drewbarrymore@outlook.com")
                    .age(46)
                    .firstName("Drew")
                    .lastName("Barrymore")
                    .nationality("American")
                    .awards("Favorite Actress - Drama/Romance - 1999 - Even After, Favorite Actress - Comedy/Romance - 2000 - Never Been Kissed, Icon Award - 2000 - Herself")
                    .role("Gertie at E.T the Extra Terrestrial, Casey Becker at Scream")
                    .build(),
            Actor.builder()
                    .email("timallen@gmail.com")
                    .age(68)
                    .firstName("Tim")
                    .lastName("Allen")
                    .nationality("American")
                    .awards("Outstanding Voice Acting in a Feature Production/Annie Awards - 2000 - Toy Story 2, Favorite Actor in a Comedy/TV Guide Awards - 1999 - Home Improvement, Favorite Comeback/TV Guide Awards - 2012 - Last Man Standing")
                    .role("Buzz Lightyear at Toy Story, Tim Taylor at Home Improvement")
                    .build()
        );
    //actorService.createAll(actors);
    logger.info("Created 3 actors: {}", actors);
    }
}
